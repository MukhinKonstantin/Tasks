package task6;

public class Part7_longestNonrepeatingSubstring {
  public static void main(String[]args){
    System.out.println(longestNonrepeatingSubstring("abcabcbb"));
  }
  public static String longestNonrepeatingSubstring(String str) {
    String firstW = "";
    String lastW = "";
    for (int i = 0; i < str.length(); i++) {
      if (!firstW.contains(String.valueOf(str.charAt(i)))) {
        firstW += str.charAt(i);
        if (firstW.length() > lastW.length()) lastW = firstW;
      } else {
        str = str.substring(1);
        firstW = "";
        i = -1;
      }
    }
    return lastW;
  }

}
