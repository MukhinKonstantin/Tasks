package task1;

public class Part10_abcmatch {
  public static void main(String[] args) {
    System.out.println("Сумма: "+abcmath(42,5,10));
    System.out.println("Проверка на делимость: "+C(10));
  }

  private static int abcmath(int A, int B, int C) {
    int mass[] = new int[B];
    mass[0] = A;
    int result = 0;
    for (int i = 1; i <= B-1; i++) {
      mass[i] = mass[i - 1] * 2;
      result = mass[i] + mass[i];
    }
    return result;
  }

  private static boolean C(int C){
    if (abcmath(42,5,10)%C==0){
      return true;
    }
    else{
      return false;
    }
  }
}
