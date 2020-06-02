package task1;

public class Part9_sumOfCubes {
  public static void main(String[] args) {
    System.out.println(sumOfCubes(1,5,9));


  }

  private static int sumOfCubes(int a, int b, int c) {
    int sum = 0;
    int mass[] = new int[3];
    mass[0]=a;
    mass[1]=b;
    mass[2]=c;
    for (int i = 0; i < 3; i++){
      sum += Math.pow(mass[i],3);
    }

    return sum;
  }

}
