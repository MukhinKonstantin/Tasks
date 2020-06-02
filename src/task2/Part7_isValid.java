package task2;

public class Part7_isValid {
  public static void main(String[]args) {
    if (isValid("59001")==true) {
      System.out.println("Является почтовым индексом");
    }
    else {
      System.out.println("Не является почтовым индексом");
    }
  }

  private static boolean isValid(String ind){
    char mass[]={'0','1','2','3','4','5','6','7','8','9'};
    int col = 0;
    for(int j = 0; j<ind.length();j++){
      char b = ind.charAt(j);
      for(int i=0;i<mass.length;i++){
        if(b==mass[i]){
          col+=1;
        }
      }
    }
    if(col>5){
      return false;
    }
    for(int i = 0; i<ind.length();i++){
      char a = ind.charAt(i);
      if(a==' '){
        return false;
      }
    }

    return true;
  }
}
