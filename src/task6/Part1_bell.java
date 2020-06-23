package task6;

public class Part1_bell {
  public static void main(String[]args){
    System.out.println(bell(3));
  }
  public static int bell(int length) {
    if (length == 1) return 1;
    else if (length == 2) return 2;
    else {
      int[][] mas = new int[length][length];
      mas[1][0] = mas[0][0] = 1;
      mas[1][1] = 2;
      for (int j = 2; j < length; j++) {
        mas[j][0] = mas[j - 1][j - 1];
        for (int i = 1; i <= j; i++) mas[j][i] = mas[j][i - 1] + mas[j - 1][i - 1];
      }
      return mas[length - 1][length - 1];
    }
  }

}
