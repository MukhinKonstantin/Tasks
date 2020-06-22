package task5;

public class Part9_correctTitle {
  public static void main (String[] args) {
    System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
  }
  public static String correctTitle(String str){
    StringBuilder str2 = new StringBuilder();
    str = str.replace("-", " - ");
    String[] word = str.split(" ");
    for (String s : word){
      if ((s.equalsIgnoreCase("in"))|(s.equalsIgnoreCase("the"))|(s.equalsIgnoreCase("and"))|(s.equalsIgnoreCase("of")))
        str2.append(Character.toLowerCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" ");
      else
        str2.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1).toLowerCase()).append(" ");
    }
    return str2.toString();
  }

}
