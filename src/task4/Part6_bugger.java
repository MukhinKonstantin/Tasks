package task4;

public class Part6_bugger {
  public static void main (String[]args){
    System.out.println(bugger(999));
  }
  static int bugger(int num){
    if(num<10){
      return 0;
    }
    int vsp = 1;
    while(num!=0){
      vsp = vsp*(num%10);
      num = num/10;
    }
    return 1 + bugger(vsp);
  }
}
