public class HeapSort {
  private final int[] arr;

  public HeapSort(int[] arr) {
    this.arr = arr;
  }

  public int[] getArr() {
    return this.arr;
  }

  private void heapify(int[] arr, int arrLength, int num) {
    int root = num;
    int left = 2 * num + 1;
    int right = 2 * num + 2;

    if (left < arrLength && arr[root] < arr[left]) {
      root = left;
    }

    if (right < arrLength && arr[root] < arr[right]) {
      root = right;
    }

    if (root != num) {
      int temp = arr[root];
      arr[root] = arr[num];
      arr[num] = temp;

      heapify(arr, arrLength, root);
    }
  }

  public int[] heapSort() {
    int arrLength = this.getArr().length;

    for (int i = arrLength/2; i > -1; i--) {
      heapify(getArr(), arrLength, i);
    }

    for (int i = arrLength - 1; i > 0; i--) {
      int temp = getArr()[i];
      getArr()[i] = getArr()[0];
      getArr()[0] = temp;

      heapify(getArr(), i, 0);
    }

    return this.getArr();
  }
}
