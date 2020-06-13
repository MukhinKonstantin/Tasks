package task3;

public class Part5_isValidHexCode {
  public static void main(String[]args){
    System.out.println(isValidHexCode("#CD5C5C"));
  }
  private static boolean isValidHexCode(String str){
    if(str.charAt(0)!='#'){
      return false;
    }
    if(str.length()!=7){
      return false;
    }
    char mass[] ={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','A','B','C','D','E','F'};
    int vsp = 0;
    for(int i=0; i<6;i++){
      for(int j=0;j<22;j++){
        if(str.charAt(i+1)==mass[j]){
          vsp++;
          break;
        }
      }
    }
    if(vsp!=6){
      return false;

    }
    return true;

  }

}
