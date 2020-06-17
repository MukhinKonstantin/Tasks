package task4;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Part5_BMI {
  public static void main(String[]args){
    check check1 = new check();
    check1.BMI("205 pounds", "73 inches");
  }
  static class check {
    String chislo1;
    String chislo2;
    double ves;
    double rost;
    void BMI (String str1, String str2) {
      if (str1.contains(" pounds")) {
        chislo1 = str1.replaceFirst(" pounds", "0");
        ves = (Double.parseDouble(chislo1)/10)*0.453592;
      }
      else  if (str1.contains(" kilos")) {
        chislo1 = str1.replaceFirst(" kilos", "0");
        ves = Double.parseDouble(chislo1)/10;
      }

      if (str2.contains(" inches")) {
        chislo2 = str2.replaceFirst(" inches", "0");
        rost = (Double.parseDouble(chislo2)/10)*0.0254;
      }
      else if (str2.contains(" meters")) {
        chislo2 = str2.replaceFirst(" meters", "0");
        if (chislo2.contains(".")) {
          rost = Double.parseDouble(chislo2);
        }
        else {
          rost = Double.parseDouble(chislo2)/10;
        }
      }
      double result = ves/(rost*rost);
      String d = new BigDecimal(result).setScale(1, RoundingMode.HALF_UP).toString(); // Округление ИМТ до ближайшей десятой
      if (result < 18.5) {
        System.out.println(d+ "  Overweight");
      }
      else if ((result >= 18.5) && (result <= 24.9)) {
        System.out.println(d+ "  Normal weight");
      }
      else {
        System.out.println(d+ "  Underweight");
      }
    }
  }
}
