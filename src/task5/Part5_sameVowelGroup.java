package task5;

public class Part5_sameVowelGroup {
  public static void main(String[]args){
    System.out.println(sameVowelGroup("toe", "ocelot", "maniac"));
  }
  static String sameVowelGroup(String... s) {
    StringBuilder glasn = new StringBuilder("aeiou");
    StringBuilder word = new StringBuilder(s[0] + " ");
    for (char ch : s[0].toCharArray())
      if (glasn.toString().contains(String.valueOf(ch))) glasn.deleteCharAt(glasn.indexOf(String.valueOf(ch)));
    for (int i = 1; i < s.length; i++) {
      boolean dq = true;
      for (char ch : glasn.toString().toCharArray())
        if (s[i].contains(String.valueOf(ch))) {
          dq = false;
          break;
        }
      word.append(dq ? (s[i]) + " " : "");
    }
    return word.toString();
  }
}
