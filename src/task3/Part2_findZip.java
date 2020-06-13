package task3;

public class Part2_findZip {
  public static void main(String[]args){
    System.out.println(findZip("all zip files are zipped zip"));
  }
  private static int findZip(String str) {
    int ind = -1;
    int kol = 0;
    for (int i = 0; i < str.length() - 2; i++) {
      char ch = str.charAt(i);
      char ch1 = str.charAt(i + 1);
      char ch2 = str.charAt(i + 2);
      if (ch == 'z' && ch1 == 'i' && ch2 == 'p') {
        kol++;
        if (kol == 2) {
          ind = i;
        }
      }
    }
    return ind;
  }

}
