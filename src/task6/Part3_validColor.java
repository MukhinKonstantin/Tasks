package task6;

public class Part3_validColor {
  public static void main(String[]args){
    System.out.println(validColor("rgb(0,0,0)"));
  }
  static boolean validColor(String rgb) {
    if (rgb.matches("rgb\\((([01]?\\d?\\d|2[0-5]{2}),){2}([01]?\\d\\d|2[0-5]{2})\\)")) {
      return true;
    }
    else {
      return rgb.matches("rgba\\((([01]?\\d\\d|2[0-5]{2}),){3}(0|0.[0-9]+|1)\\)");
    }
  }
}
