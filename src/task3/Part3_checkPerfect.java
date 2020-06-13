package task3;

public class Part3_checkPerfect {
  public static void main(String[]args){
    System.out.println(checkPerfect(6));
  }

  private static boolean checkPerfect(int ch){
    int CH = 0;
    for(int i = 1; i<ch;i++){
      if(ch%i==0){
        CH+=i;
      }
    }
    if(CH==ch){
      return true;
    }
    else{
      return false;
    }
  }
}
