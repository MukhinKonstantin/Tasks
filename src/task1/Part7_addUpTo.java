package task1;

import java.util.Arrays;

public class Part7_addUpTo {

  public static void main(String[] args) {
    System.out.println(addUpTo(3));


  }

  private static int addUpTo(int k) {
    int sum = 0;
    int q = 0;
    int mass[] = new int[k];
    for (int i = 0; i <= k-1; i++) {
      mass[i] = q + 1;
      q+=1;
      sum+=q;
    }
    return sum;
  }
}