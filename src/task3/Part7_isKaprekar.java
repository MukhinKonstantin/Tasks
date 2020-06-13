package task3;

public class Part7_isKaprekar {
  public static void main (String[]args){
    System.out.println(isKaprekar(297));
  }
  private static boolean isKaprekar(int n){
    int n2 = n*n;
    boolean s = false;
    int length = String.valueOf(n).length();
    int lengthn2 = String.valueOf(n2).length();

    if (lengthn2 % 2 == 0) {
      int raz = lengthn2 / 2;
      double a1 = n2/ (Math.pow(10, raz));
      int a6=(int) a1;
      double a2 = n2 % (Math.pow(10, raz));
      if (a6 + a2==n) s = true;
      else s = false;
    }
    if (lengthn2 % 2 != 0) {
      int raz = lengthn2 / 2;
      double a3 = n2 / (Math.pow(10, lengthn2 - raz));
      int  a5= (int) a3;
      double a4 = n2 % (Math.pow(10, lengthn2 - raz));
      if (a4 +a5==n) s = true;
      else s = false;
    }
    return s;
  }
}
