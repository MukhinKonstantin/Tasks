package task1;

public class Part5_operation {
  public static void main(String[]args){
    System.out.println(operation(24,26,2));
  }

  private static String operation(int N, int a, int b){
    if (a+b==N){
      return "added";
    }
    else if (a-b==N){
      return "subtracted";
    }
    else if (a*b==N){
      return "multiply";
    }
    else if (a/b==N){
      return "share";
    }
    else {
      return "none";
    }
  }
}
