package task1;


public class Part3_animals {
  public static void main(String[]args)  {
    System.out.println("Общее количество ног: "+animals(2,3,5));
  }

  public static int animals(int CH, int CO, int PI){
    int ch = 2;
    int co = 4;
    int pi = 4;
    return ch*CH+co*CO+pi*PI;

  }
}
