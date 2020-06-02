package task2;

public class Part6_Fibonacci {

  public static void main(String[] args) {
    System.out.println(Fibonacci(12));
  }

  private static int Fibonacci(int ch) {
    int n0 = 1;
    int n1 = 1;
    int n2 = 0;
    int mass[] = new int[ch+10];
    for (int i = 3; i <= ch+1; i++) {
      n2 = n0 + n1;
      n0 = n1;
      n1 = n2;
      mass[i]=n2;
    }
    return n2;

  }
}