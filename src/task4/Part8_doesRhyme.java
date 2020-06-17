package task4;

public class Part8_doesRhyme {
  public static void main(String[]args){
    System.out.println(doesRhyme("Sam I am!","Green eggs and ham."));
  }
  static boolean doesRhyme(String a, String b) {
    String la = a.split(" ")[a.split(" ").length - 1].replaceAll("[!.?]", "");
    String lb = b.split(" ")[b.split(" ").length - 1].replaceAll("[!.?]", "");
    return lb.toLowerCase().endsWith(la.toLowerCase());
  }

}
