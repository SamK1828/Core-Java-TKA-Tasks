package dailytasks;

import java.util.Scanner;

public class SwapInArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before swapping:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray after swapping:");
        for (int i = 0; i < size; i += 2) {
            if (i + 1 < size) {
                swap(arr, i, i + 1);
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
        System.out.println();
    }
}
