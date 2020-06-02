package task1;

public class Part6_ctoa {
  public static void main(String[]args){
    System.out.println(ctoa("["));
  }
  public static int ctoa(String i){
    int str = i.codePointAt(0);
    return  str;
  }

}