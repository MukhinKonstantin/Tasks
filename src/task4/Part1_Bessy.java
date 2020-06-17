package task4;

public class Part1_Bessy {
  public static void main(String[]args){
    Bessy(10, 7, "hello my name is Bessie and this is my essay");
  }
  public static void Bessy(int n, int k, String c) {
    int maxs = 0;
    String[] i = c.split(" ");
    if (i.length == n) {
      for (String s : i) {
        if (s.length() + maxs <= k) {
          System.out.print(s + " ");
          maxs = maxs + s.length();
        } else {
          System.out.println("");
          System.out.print(s + " ");
          maxs = s.length();
        }
      }
    }
  }
}
