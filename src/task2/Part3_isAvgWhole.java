package task2;

public class Part3_isAvgWhole {
  public static void main(String[] args) {
    int massiv[] = {1,5,6};
    hp HP = new hp();
    boolean result = HP.isAvgWHole(massiv);
    System.out.println(result);
  }
}
class hp {
  static boolean isAvgWHole(int massiv[]) {
    int sum = 0;
    for (int i = 0; i < massiv.length; i++) {
      sum = sum + massiv[i];
    }
    if ((sum % (massiv.length + 1)) == 0) {
      return true;
    } else {
      return false;
    }
  }
}