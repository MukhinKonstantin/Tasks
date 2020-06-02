package task1;

public class Part8_nextEdge {
  public static void main(String[] args) {
    System.out.println(nextEdge(8,10));


  }

  private static int nextEdge(int k, int l) {
    int rebr = l+k-1;
    return rebr;
  }

}
