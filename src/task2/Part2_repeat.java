package task2;

public class Part2_repeat {
  public static void main(String[]args){
    System.out.println(repeat("mice", 5));
  }

  private static String repeat(String str, int col){
    char[] strToArray = str.toCharArray();
    String finish = "";
    for(int i=0; i <=str.length()-1; i++){
      for(int j=0; j <col; j++){
        finish += strToArray[i];

      }
    }
    return finish;
  }

}
