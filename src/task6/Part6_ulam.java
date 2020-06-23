package task6;
import java.util.Vector;
public class Part6_ulam {
  public static void main(String[]args){
    System.out.println(ulam(206));
  }
  public static int ulam(int n) {
    Vector<Integer> arr = new Vector<Integer>();
    arr.add(1);
    arr.add(2);
    for (int i = 3; i < Integer.MAX_VALUE; i++) {
      int count = 0;
      for (int j = 0; j < arr.size() - 1; j++) {
        for (int k = j + 1; k < arr.size(); k++) {
          if (arr.get(j) + arr.get(k) == i) {
            count++;
          }
          if (count > 1)
            break;
        }
        if (count > 1)
          break;
      }
      if (count == 1) {
        arr.add(i);
      }
      if (arr.size() >= n) break;
    }
    return arr.lastElement();
  }
}
