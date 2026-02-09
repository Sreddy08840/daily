public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = 5; // current size

        System.out.print("Before Deletion: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();

        int pos = 2; // delete element at index 2 (30)

        int deleted = arr[pos];
        for (int j = pos; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }
        n--;

        System.out.println("Deleted: " + deleted);
        System.out.print("After Deletion: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
