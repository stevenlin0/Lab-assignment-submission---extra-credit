public class MergeSortedArrays {
    public static void merge(int[] A, int m, int[] B, int n) {
        int i = m - 1; // Index of last element in array A
        int j = n - 1; // Index of last element in array B
        int k = m + n - 1; // Index of last element in merged array

        // Merge array A and array B starting from their ends
        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }

        // If there are remaining elements in B, copy them to A
        while (j >= 0) {
            A[k--] = B[j--];
        }
    }

    public static void main(String[] args) {
        int[] A = new int[7]; // A has a large enough buffer to hold B
        A[0] = 1;
        A[1] = 3;
        A[2] = 5;
        int[] B = {2, 4, 6};
        int m = 3; // Number of elements in A
        int n = 3; // Number of elements in B

        merge(A, m, B, n);

        // Print the merged array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
