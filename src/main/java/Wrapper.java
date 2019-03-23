import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Wrapper {

  public static String execute(String text, int max_line_length) {
    List<String> lines = new ArrayList();
    toLines(text, max_line_length, lines);
    return lines.stream().collect(Collectors.joining("\n"));
  }

  private static void toLines(String text, int max_line_length, List<String> lines) {
    if (text.length() > max_line_length) {
      lines.add(text.trim().substring(0, max_line_length).trim());
      text = text.trim().substring(max_line_length);
      toLines(text, max_line_length, lines);
    } else {
      if (!text.isEmpty()) {
        lines.add(text);
      }
    }
  }
}
