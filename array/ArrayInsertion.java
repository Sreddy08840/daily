public class ArrayInsertion {
    public static void main(String[] args) {
        int[] arr = new int[10]; // capacity = 10
        int n = 5; // current size
        arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;

        System.out.print("Before Insertion: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();

        int pos = 2;  // index position
        int item = 25; // new element

        // shift elements right
        for (int j = n; j > pos; j--) {
            arr[j] = arr[j - 1];
        }
        arr[pos] = item;
        n++;

        System.out.print("After Insertion: ");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
