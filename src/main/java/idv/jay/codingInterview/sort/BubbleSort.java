package idv.jay.codingInterview.sort;

public class BubbleSort {

  private BubbleSort() {throw new IllegalStateException("Sample code class");}

  public static void bubbleSort(int[] input) {
    for (int i = 0; i < input.length; i++) {
      boolean isChange = false;
      for (int j = 1; j < input.length; j++) {
        if (input[j -1] > input[j]) {
          swap(j -1, j, input);
          isChange = true;
        }
      }
      if(!isChange) return;
    }
  }

  private static void swap(int i, int j, int[] numbers) {
    int t = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = t;
  }
}
