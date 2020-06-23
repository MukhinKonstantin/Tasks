package task6;

public class Part2_translateWord {
  public static void main(String[]args){
    System.out.println(translateWord("Apple"));
  }
  static String translateWord(String word) {
    StringBuilder w = new StringBuilder(word);
    if (String.valueOf(w.charAt(0)).toLowerCase().matches("[aeiou]")) w.append("y");
    while (!String.valueOf(w.charAt(0)).toLowerCase().matches("[aeiou]")) {
      w.append(Character.toLowerCase(w.charAt(0))).deleteCharAt(0);
      if (Character.isUpperCase(word.charAt(0))) w.setCharAt(0, Character.toUpperCase(w.charAt(0)));
    }
    w.append("ay");
    return w.toString();
  }
  static String translateSentence(String text) {
    StringBuilder t = new StringBuilder();
    for (String s : text.split(" ")) {
      if (s.substring(s.length() - 1).matches("[ ,.!?]"))
        t.append(translateWord(s.substring(0, s.length() - 1))).append(s.substring(s.length() - 1)).append(" ");
      else t.append(translateWord(s)).append(" ");
    }
    return t.toString();
  }

}
