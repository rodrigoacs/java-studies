/**
 * segueOrdemArray
 */
public class segueOrdemArray {
  public static void main(String[] args) {
    int[] arr = { 5, 7, 6, 9, 2, 8, 4, 0, 3 };
    int current = 0;

    System.out.print(current + 1 + ",");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[current] + ",");
      current = arr[current] - 1;
    }
  }
}
