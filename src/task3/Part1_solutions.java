package task3;

public class Part1_solutions {
  public static void main(String[]args){
    System.out.println(solutions(1,0,-1));
  }
  static int solutions(int a, int b, int c) {
    int d = b ^ 2 - 4 * a * c;
    if (d > 0) {
      return 2;
    }
    else if (d == 0) {
      return 1;
    }
    else{
      return 0;
    }
  }


}
