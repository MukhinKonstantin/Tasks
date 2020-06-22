package task5;
import java.util.Arrays;

public class Part1_EncryptDecrypt {

  public static void main(String[] args) {
    System.out.println("encrypt: " + encrypt("Hello"));
    int[] array = { 72, 33, -73, 84, -12, -3, 13, -13, -68};
    hp HP = new hp();
    String result = HP.decrypt(array);
    System.out.println("decrypt: " + result);

  }

  public static String encrypt(String str) {
    int[] str2 = new int[str.length()];
    str2[0] = str.charAt(0);
    for (int i = 1; i < str.length();
        i++) {
      str2[i] = str.charAt(i) - str.charAt(i - 1);
    }
    return Arrays.toString(str2);
  }

  static class hp {
    public static String decrypt(int[] array) {
      String str3 = "";
      str3 += (char) array[0];
      for (int i = 1; i < array.length;
          i++) {
        str3 += (char) (array[i] + str3.charAt(i - 1));
      }
      return str3;
    }
  }
}
