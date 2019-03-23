import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Wrapper {

  public static String execute(String text, int max_line_length) {
    text = text.trim();

    if (text.length() <= max_line_length) {
      return text;
    } else {
      List<String> lines = new ArrayList();
      while(text.length()>max_line_length){
        lines.add(text.trim().substring(0, max_line_length).trim());
        text = text.trim().substring(max_line_length);
      }
      if(!text.isEmpty()){
        lines.add(text);
      }

      return lines.stream().collect(Collectors.joining("\n"));
    }
  }
}
