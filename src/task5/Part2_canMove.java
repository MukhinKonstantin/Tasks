package task5;

public class Part2_canMove {
  public static void main(String[] args) {
    System.out.println(canMove("Rook", "A8", "H8"));
  }
  public static boolean canMove(String figure, String start, String end) {
    int x1 = start.charAt(0);
    int y1 = start.charAt(1);
    int x2 = end.charAt(0);
    int y2 = end.charAt(1);
    switch (figure) {
      case "Pawn":
        return (x1 == x2) & (y2 - y1 == 2 | y2 - y1 == 1);
      case "Knight":
        return (Math.abs(x2 - x1) == 1 & Math.abs(y2 - y1) == 2) | (Math.abs(x2 - x1) == 2
            & Math.abs(y2 - y1) == 1);
      case "Bishop":
        return (Math.abs(y2 - y1) == Math.abs(x2 - x1));
      case "Rook":
        return (x1 == x2) | (y1 == y2);
      case "Queen":
        return (Math.abs(y2 - y1) == Math.abs(x2 - x1)) | (x1 == x2) | (y1
            == y2);
      case "King":
        return (Math.abs(y2 - y1) <= 1 & Math.abs(x2 - x1) <= 1);
    }
    return false;
  }
}