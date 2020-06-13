package task3;

public class Part8_longestZero {
  public static void main(String[]args){
    System.out.println(longestZero("01100001011000"));
  }
  static String longestZero(String s) {
    int max = 0;
    int maxi = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        maxi++;
        if (maxi > max) max = maxi;
      } else {
        maxi = 0;
      }
    }
    String res = "";
    for (int i = 1; i <= max; i++){
      res += "0";
    }
    return res;
  }

}
