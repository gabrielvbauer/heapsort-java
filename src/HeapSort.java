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

    /* Verificando se o filho da esquerda existe e se é maior que o seu elemento raiz */
    if (left < arrLength && arr[root] < arr[left]) {
      root = left;
    }

    /* Verificando se o filho da direita existe e se é maior que o seu elemento raiz */
    if (right < arrLength && arr[root] < arr[right]) {
      root = right;
    }

    /* caso algum dos elementos filhos seja maior, a troca de elementos raiz é feita */
    if (root != num) {
      int temp = arr[root];
      arr[root] = arr[num];
      arr[num] = temp;

      /* Construindo um novo maxheap com as novas mudanças na árvore */
      heapify(arr, arrLength, root);
    }
  }

  /* A função heapsort organiza um array definido no construtor */
  public int[] heapSort() {
    int arrLength = this.getArr().length;

    /* Constrói um maxheap */
    for (int i = arrLength/2; i > -1; i--) {
      heapify(getArr(), arrLength, i);
    }

    /* Extraindo os elementos um por um */
    for (int i = arrLength - 1; i > 0; i--) {
      int temp = getArr()[i];
      getArr()[i] = getArr()[0];
      getArr()[0] = temp;

      heapify(getArr(), i, 0);
    }

    return this.getArr();
  }
}
