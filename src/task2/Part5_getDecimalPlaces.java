package task2;
import java.lang.String;
public class Part5_getDecimalPlaces {
  public static void main(String[]args){
    System.out.println("Количество знаков после запятой: "+ getDecimalPlaces("43.20"));

  }
  private static int getDecimalPlaces (String ch){

    for (int i =0;i<ch.length();i++){
      char result = ch.charAt(i);
      if(result == '.'){
        int start = i+1;
        return ch.length()-start;
      }
    }

    return 0;
  }

}
