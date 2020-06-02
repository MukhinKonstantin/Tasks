package task2;

public class Part1_differenceMaxMin {
  public static void main(String[] args) {
    int massiv[] = {44,32,86,19};
    vsp VSP = new vsp();
    int result = VSP.differenceMaxMin(massiv);
    System.out.println(result);


  }
}
class vsp{
  int max = -99999999;
  int min =  99999999;
  public int differenceMaxMin( int massiv[]) {
    for (int i = 0; i < massiv.length; i++) {
      if (massiv[i] > max) {
        max = massiv[i];
      }
      else if (massiv[i] < min) {
        min = massiv[i];
      }
    }

    return max-min;
  }
}
