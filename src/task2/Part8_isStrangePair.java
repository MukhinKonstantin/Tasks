package task2;


public class Part8_isStrangePair {
  public static void main(String[]args){
    System.out.println(isStrangePair("sparkling","groups"));
  }
  private static boolean isStrangePair(String a, String b){
    char beg1 = a.charAt(0);
    char beg2 = b.charAt(0);
    char end1 = a.charAt(a.length()-1);
    char end2 = b.charAt(b.length()-1);
    if(beg1==end2 & beg2==end1){
      return true;
    }
    return false;
  }

}
