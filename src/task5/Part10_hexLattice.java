package task5;

public class Part10_hexLattice {
  public static void main(String[]args){
    System.out.println(hexLattice(19));
  }
  static String hexLattice(int num) {
    int n = 1, count = 1;
    String res = "";
    while (count < num) count += 6 * n++;
    if (count != num) System.out.println("invalid value, try: " + count);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++){
        res += " ";
      }
      for (int j = 0; j < n + i; j++){
        res += "0 ";
      }
      res += "\n";
    }
    for (int i = n - 1; i > 0; i--) {
      for (int j = 0; j <= n - i; j++){
        res += " ";
      }
      for (int j = 1; j < n + i; j++){
        res += "0 ";
      }
      res += "\n";
    }
    return res;
  }
}
