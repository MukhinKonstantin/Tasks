package task4;

public class Part10_countUniqueBooks {
  public static void main(String[]args){
    System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
  }
  public static int countUniqueBooks(String stringSequence, char bookEnd) {
    int i = 0;
    String res = "";
    for (String s : stringSequence.split(Character.toString(bookEnd))) {
      if (i++ % 2 == 1) {
        for (char c : s.toCharArray()) {
          if (res.indexOf(c) == -1)
            res += c;
        }
      }
    }
    return res.length();
  }
}
