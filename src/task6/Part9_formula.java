package task6;

public class Part9_formula {
  public static void main(String[]args){
    System.out.println(formula("6 * 4 = 24"));
  }
  static boolean formula (String formula){
    formula+=" = " + formula;
    String [] arr = formula.split(" ");
    int n=0,n1=0,i=0;
    while(i<7) {
      if (arr[i+1].equals("+")) n1 = Integer.parseInt(arr[i]) + Integer.parseInt(arr[i+2]);
      else if (arr[i+1].equals("-")) n1 = Integer.parseInt(arr[i]) - Integer.parseInt(arr[i+2]);
      else if (arr[i+1].equals("*")) n1 = Integer.parseInt(arr[i]) * Integer.parseInt(arr[i+2]);
      else if (arr[i+1].equals("/") & !arr[i+2].equals("0")) n1 = Integer.parseInt(arr[i]) / Integer.parseInt(arr[i+2]);
      n = n1;
      i+=6;
    }
    return Integer.parseInt(arr[4])==n & Integer.parseInt(arr[4])==n1;
  }

}
