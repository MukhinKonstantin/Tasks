package task5;



public class Part4_sumDigProd {
  public static void main(String[]args){
    System.out.println(sumDigProd(16, 28));
  }
  public static int sumDigProd(int... mas) {
    int result = 0;
    for (int i : mas) result += i;
    while (result >= 10) {
      int m = 1;
      for (char c : String.valueOf(result).toCharArray())
        m *= Integer.parseInt(String.valueOf(c));
      result = m;
    }
    return result;
  }
}
