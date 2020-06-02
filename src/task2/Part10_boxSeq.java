package task2;

public class Part10_boxSeq {
  public static void main (String[]args){
    System.out.println(boxSeq(1));
  }
  private static int boxSeq(int k){
    int sum = 0;
    int n = 0;
      while (n < k) {
        if (n % 2 == 0) {
          sum += 3;
        }
        else {
          sum -= 1;
        }
        n++;
      }
      return sum;
    }

  }
