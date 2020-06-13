package task3;

public class Part10_rightTriangle {
  public static void main(String[]args){
    System.out.println(rightTriangle(3,4,5));
  }
  private static boolean rightTriangle(double a , double b, double c){
    if(a>b && a>c) {
      if(b*b+c*c==a*a){
        return true;
      }
    else{
      return false;
      }
    }
    if(c>b && c>a){
      if(b*b+a*a==c*c){
        return true;
      }
      else{
        return false;
      }
    }
    if (b>c && b>a){
      if (c*c+a*a==b*b) {
        return true;
      }
      else {
        return false;
      }
    }
    return false;
  }
}
