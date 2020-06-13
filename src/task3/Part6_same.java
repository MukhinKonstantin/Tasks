package task3;

public class Part6_same {
  public static void main(String[] args) {
    int massiv1[] = {1,3,4,4,4};
    int massiv2[] = {2,5,7};
    hp HP = new hp();
    boolean result = HP.same(massiv1, massiv2);
    System.out.println(result);
  }
}
class hp {
  static boolean same(int massiv1[], int massiv2[]) {
    int kol1 = 0;
    int kol2 = 0;
    int k=1;
    int f=1;
    for (int i = 0; i< massiv1.length-1; i++) {
      if (massiv1[i] == massiv1[i+1]) {
        kol1++;
      }
    }
    for (int i = 0; i< massiv2.length-1; i++) {
      if (massiv2[i] == massiv2[i+1]) {
        kol2++;
      }
    }
    int kolvo1 = massiv1.length-kol1;
    int kolvo2 = massiv2.length-kol2;
    if (kolvo1==kolvo2) {
      return true;
    }
    else {
      return false;
    }

  }
}
