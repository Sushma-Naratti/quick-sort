public class quickSort {
      // time complexity worst case=O(n^2)(worst case when pivot element is smallest
      // or largest elemet in the given array) in average case it is O(nlog(n))

      public static int partition(int a[], int start, int end) {
            int pivot = a[end];
            int i = start - 1;
            for (int j = start; j < end; j++) {
                  if (a[j] < pivot) {
                        i++;
                        // swap
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                  }
            }
            i++;
            int temp = a[i];
            a[i] = pivot;
            a[end] = temp;
            return i;

      }

      public static void QuickSort(int a[], int start, int end) {
            if (start < end) {
                  int pivotI = partition(a, start, end);

                  QuickSort(a, start, pivotI - 1);
                  QuickSort(a, pivotI + 1, end);
            }
      }

      public static void main(String[] args) {
            int a[] = { 6, 3, 9, 5, 2, 8 };
            int n = a.length;

            QuickSort(a, 0, n - 1);

            for (int i = 0; i < a.length; i++) {
                  System.out.println(a[i]);
            }
      }
}
