package task2;

public class Part4_cumulativeSum {
  public static void main(String[] args) {
    int massiv[] = {1,2,3,4};
    cumu CUMU = new cumu();
    int[] result = CUMU.cumulativeSum(massiv);
    System.out.println(result);
  }
}
class cumu{
  public int[] cumulativeSum(int[] massiv){
    int sum = 0;
    int[] MAS=new int[massiv.length];
    for(int i = 0;i<massiv.length;i++){
      sum += massiv[i];
      MAS[i]= sum;
      System.out.println(MAS[i]);
    }
    return MAS;
  }

}