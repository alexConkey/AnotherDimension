public class Tester{
  public static void main(String[] args) {
    int[] testArr = {1, 2, 5, 8 ,20};
    int[][] testMatrix = {{7,4,6},{4, 3},{8, 5, 6 ,9}};
    System.out.println(ArrayOps.sum(testArr));
    System.out.println(ArrayOps.largest(testArr));
    System.out.println(ArrayOps.sumRows(testMatrix));
    System.out.println(ArrayOps.largestInRows(testMatrix));
  }
}
