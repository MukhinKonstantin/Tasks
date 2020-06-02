package task2;

public class Part9_isPrefix_isSuffix {
  public static void main(String[]args){
    System.out.print("Prefix: ");
    System.out.println(isPrefix("automation", "auto-"));
    System.out.print("Suffix: ");
    System.out.println(isSuffix("arachnophobia", "-phobia"));
  }

  private static boolean isPrefix(String str1, String pref){
    int i = 0;
    while(str1.charAt(i)==pref.charAt(i)){
      i++;
    }
    if(i<pref.length()-1){
      return false;
    }
    return true;

  }

  private static boolean isSuffix(String str2, String suff){
    int j = str2.length()-1;
    int k = suff.length()-1;
    int vsp = 0;
    while(str2.charAt(j)==suff.charAt(k)){
      j--;
      k--;
      vsp++;
    }
    if(k-vsp>=1){
      return false;
    }
    return true;
  }
}
