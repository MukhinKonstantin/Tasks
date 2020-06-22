package task5;

public class Part7_numToEng {
  public static void main(String[]args){
    System.out.println(numToEng(126));
  }
  public static String numToEng(int a) {
    String res = "";
    if (a == 0) {
      res = "zero";
    } else {
      if (a / 100 > 0) {
        switch (a / 100) {
          case (1):
            res += "one";
            break;
          case (2):
            res += "two";
            break;
          case (3):
            res += "three";
            break;
          case (4):
            res += "four";
            break;
          case (5):
            res += "five";
            break;
          case (6):
            res += "six";
            break;
          case (7):
            res += "seven";
            break;
          case (8):
            res += "eight";
            break;
          case (9):
            res += "nine";
            break;
        }
        res += " hundred ";
      }
      if (a / 10 % 10 == 1) {
        switch (a % 100) {
          case (11):
            res += "eleven";
            break;
          case (12):
            res += "twelve";
            break;
          case (13):
            res += "thirteen";
            break;
          case (14):
            res += "fourteen";
            break;
          case (15):
            res += "fifteen";
            break;
          case (16):
            res += "sixteen";
            break;
          case (17):
            res += "seventeen";
            break;
          case (18):
            res += "eighteen";
            break;
          case (19):
            res += "nineteen";
            break;
        }
      } else {
        switch (a / 10 % 10) {
          case (1):
            res += "ten ";
            break;
          case (2):
            res += "twenty ";
            break;
          case (3):
            res += "thirty ";
            break;
          case (4):
            res += "forty ";
            break;
          case (5):
            res += "fifty ";
            break;
          case (6):
            res += "sixty ";
            break;
          case (7):
            res += "seventy ";
            break;
          case (8):
            res += "eighty ";
            break;
          case (9):
            res += "ninety ";
            break;
        }
        switch (a % 10) {
          case (1):
            res += "one";
            break;
          case (2):
            res += "two";
            break;
          case (3):
            res += "three";
            break;
          case (4):
            res += "four";
            break;
          case (5):
            res += "five";
            break;
          case (6):
            res += "six";
            break;
          case (7):
            res += "seven";
            break;
          case (8):
            res += "eight";
            break;
          case (9):
            res += "nine";
            break;
        }
      }
    }
    return res;
  }
}
