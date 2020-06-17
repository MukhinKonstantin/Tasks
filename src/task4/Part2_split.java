package task4;

public class Part2_split {
  public static void main (String[]args){
    split("()()()");
  }
  private static void split(String str) {
    String[] Array = new String[str.length()/2];
    String str1 = "";
    int a=0;
    int b=0;
    System.out.print("[ ");
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) !='(') {
        a++;
        str1=str1+str.charAt(i);
      }
      else { b++;
        str1=str1+str.charAt(i);
      }
      if(b==a) {
        System.out.printf("'%s', ",str1);

        //Array[i]=str1;
        b=0;
        a=0;
        str1="";
      }
    }
    System.out.println("]");
  }
}
