package task3;

public class Part4_flipEndChars {
  public static void main(String[]args){
    System.out.println(flipEndChars("AbricoS"));
  }
  private static String flipEndChars(String str){
    if(str.length()<2){
      return "несовместимо";
    }
    char beg = str.charAt(0);
    char end = str.charAt(str.length()-1);
    if(beg==end){
      return "два-это пара";
    }
    //String newstr = str.replace(str.charAt(0),str.charAt(str.length()-1));
    //String newstr2 = newstr.replace(newstr.charAt(newstr.length()-1),str.charAt(0));

    StringBuffer newstr = new StringBuffer(str);
    newstr.setCharAt(0,str.charAt(str.length()-1));

    StringBuffer newstr1 = new StringBuffer(newstr);
    newstr1.setCharAt(str.length()-1,str.charAt(0));

    return String.valueOf(newstr1);
  }


}
