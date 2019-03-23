public class Wrapper {
  public static String execute(String text, int max_line_length) {
    text=text.trim();

    if(text.length()<=max_line_length){
      return text;
    }else{
      return text.substring(0,max_line_length) + "\n" + text.substring(max_line_length);
    }
  }
}
