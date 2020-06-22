package task5;

import java.util.Scanner;

public class Part6_volidateCard {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("введите числовую строку:");
    long str = scanner.nextLong();
    System.out.println(validateCard(str));
    //System.out.println(validateCard(1234567890123452));
  }
  public static boolean validateCard(long str) {
    int sum = 0;
    StringBuffer str2 = new StringBuffer(String.valueOf(str));
    str2.deleteCharAt(str2.length() - 1).reverse();
    for (int i = 0; i < str2.length(); i++) {
      if (i % 2 == 0) {
        int a = Integer.parseInt(String.valueOf(str2.charAt(i)));
        while (a > 9) {
          int pr = 0;
          while (a != 0) {
            pr = pr + (a % 10);
            a = a / 10;
          }
          a = pr;
        }
        sum += a;
      } else
        sum += Integer.parseInt(String.valueOf(str2.charAt(i)));
    }
    return 10 - (sum % 10) == str % 10;
  }
}
