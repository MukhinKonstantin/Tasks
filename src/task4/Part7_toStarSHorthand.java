package task4;

public class Part7_toStarSHorthand {
  public static void main(String[]args){
    System.out.println(toStarSHorthand("abbccc"));
  }

  private static String toStarSHorthand (String str){
    str += " ";
    int sch = 1;
    String result = "";
    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        sch++;
      }
      else {
        if(sch == 1){
          result+=str.charAt(i);
        }
        if(sch!=1){
          result+=str.charAt(i) + "*" + sch;
        }
        sch = 1;
      }
    }
    return result;
  }

}
