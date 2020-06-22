package task5;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Part8_getSha256Hash {
  public static void main(String[] args) throws NoSuchAlgorithmException {
    System.out.println(getSha256Hash("password123"));
  }
  static String getSha256Hash(String str) throws NoSuchAlgorithmException {
    byte[] hash = MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8));
    StringBuilder a = new StringBuilder();
    for (byte b : hash)
      a.append(String.format("%02x", b));
    return a.toString();
  }
}
