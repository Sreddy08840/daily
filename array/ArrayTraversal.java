public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {5, 12, 7, 20, 3};
        int n = arr.length;

        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Finding MIN, MAX, AVERAGE
        int min = arr[0], max = arr[0], sum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        System.out.println("\nMin = " + min);
        System.out.println("Max = " + max);
        System.out.println("Average = " + (sum / (double)n));
    }
}
