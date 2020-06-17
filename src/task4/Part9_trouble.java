package task4;

public class Part9_trouble {
  public static void main(String[]args){
    System.out.println(trouble(666789, 12345667));
  }
  public static boolean trouble(int a, int b) {
    int[] massiv1 = new int[10];
    int[] massiv2 = new int[10];
    for (int i=0;i<=9;i++){
      massiv1[i]=0;
      massiv2[i]=0;
    }
    while (a!=0 | b!=0){
      massiv1[a%10]++;
      massiv2[b%10]++;
      a/=10;
      b/=10;
    }
    for (int i=0;i<=9;i++){
      if (massiv1[i]==3 & massiv2[i]==2) {
        return true;
      }
    }
    return false;
  }
}
