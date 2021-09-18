import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array = {10, 9, 5, 8, 4, 3, 6, 2, 1, 7};

    System.out.printf("""
                      ------------------
                      Array original: %s
                      ------------------
                      """, Arrays.toString(array));
    HeapSort hs = new HeapSort(array);
    System.out.printf("""
                      Array organizado: %s
                      ------------------
                      """, Arrays.toString(hs.heapSort()));
  }
}

