package task6;
import java.util.Arrays;
public class Part4_stripUrlParams {
  public static void main(String[]args){
    System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2"));
  }
  static String stripUrlParams(String url, String... param) {
    if (!url.contains("?")) return url;
    StringBuilder u = new StringBuilder();
    for (String s : url.split("\\?")[1].split("&")) {
      if (Arrays.toString(param).contains(s.substring(0, 1))) continue;
      else if (u.indexOf(s.substring(0, 1)) != -1)
        u.delete(u.indexOf(s.substring(0, 1)), u.indexOf(s.substring(0, 1)) + 4);
      u.append(s).append("&");
    }
    u.insert(0, url.substring(0, url.indexOf("?") + 1));
    return u.toString().substring(0, u.length() - 1);
  }

}
