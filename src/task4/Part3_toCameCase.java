package task4;

public class Part3_toCameCase {
  public static void main(String[] args) {
    String str = "helloEdabit";
    check check1 = new check();
    if (str.contains("_")) {
      check1.toCamelCase(str);
          } else {
      check1.toSnakeCase(str);
    }
  }

  static class check {
    void toCamelCase(String str) {
      while (str.contains("_")) {
      str = str.replaceFirst("_[a-z]", String.valueOf(Character.toUpperCase(str.charAt(str.indexOf("_") + 1))));
      }
      System.out.println(str);
    }
    void toSnakeCase(String str) {
      String pattern = "(?=[A-Z])";
      String[] word = str.split(pattern);
      for (int j = 0; j < word.length; j++) {
        String slovo = word[j];
        String result = slovo.toLowerCase();
        word[j] = result;
      }
      for (int i = 0; i < word.length; i++) {
        System.out.print(word[i]);
        if (i != word.length - 1) {
          System.out.print("_");
        }
      }
    }
  }
}