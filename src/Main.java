import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array = {10, 9, 5, 8, 4, 3, 6, 2, 1, 7};

    System.out.println(Arrays.toString(array));
    HeapSort hs = new HeapSort(array);
    System.out.println(Arrays.toString(hs.heapSort()));
  }
}
