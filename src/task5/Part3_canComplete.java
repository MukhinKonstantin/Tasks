package task5;

public class Part3_canComplete {
  public static void main(String[] args) {
    System.out.println(canComplete("butl", "beautiful"));
  }
  static boolean canComplete(String s, String w) {
    int i = 0;
    for (char c : w.toCharArray())
      if (s.charAt(i) == c){
        i++;
      }
    return s.length() == i;
  }
}
