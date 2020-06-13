package task3;

public class Part9_nextPrime {
  public static void main(String[]args){
    int CH=54;
    if(nextPrime(54)==true){
      System.out.println(CH);
    }
    else{
      for (int i = 2; i < CH; i++) {
        if (CH % i == 0) {
          CH++;
        }
      }
      System.out.println(CH);
    }
  }
  public static boolean nextPrime(int ch) {
    for (int i = 2; i < ch; i++) {
      if (ch % i == 0) {
        return false;
      }
    }
    return true;
  }
}
