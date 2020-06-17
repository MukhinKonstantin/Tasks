package task4;

public class Part4_overTime {
  public static void main(String[] args) {
    double massiv[] = {16,18,30,1.8};
    hp HP = new hp();
    double result = HP.overTime(massiv);
    System.out.println("$"+result);
  }
}
class hp {
  static double overTime(double massiv[]) {
    if (massiv[1]<=17){
      double reg = (massiv[1]-massiv[0])*massiv[2];
      return reg;
    }
    if (massiv[1]>17){
      double sverh = (massiv[1]-17)*massiv[2]*massiv[3];
      double reg1 = (17-massiv[0])*massiv[2];
      return sverh+reg1;
    }
  return 0;
  }

}
