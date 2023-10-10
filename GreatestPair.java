public class GreatestPair {
    static int findLargestSumPair(int[] arr, int n) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
          for (int j = i + 1; j < n; j++) {
            int sum = arr[i] + arr[j];
            if (sum > maxSum) {
              maxSum = sum;
            }
          }
        }
        return maxSum;
      }
     
      public static void main(String[] args) {
        int[] arr = {12, 34, 10, 6, 40};
        int n = arr.length;
        System.out.println(findLargestSumPair(arr, n));
      }
}
