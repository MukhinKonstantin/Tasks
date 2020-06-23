package task6;
import java.util.ArrayList;
public class Part5_getHashTags {
  public static void main(String[]args){
    System.out.println(getHashTags("How the Avocado Became the Fruit of the Global Trade"));
  }
  static String getHashTags(String text){
    ArrayList<String> word = new ArrayList<>();
    StringBuilder res = new StringBuilder();
    for (String s : text.split(" ")) {
      word.add(s.replaceAll("\\W",""));
      word.sort((o1, o2) -> o2.length() - o1.length());
    }
    for (int i = 0; i<word.size() & i<3;i++) {
      res.append("#").append(word.get(i)).append(" ");
    }
    return res.toString();
  }
}
