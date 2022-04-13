package Diziler;

public class HelperArray {

    //static metodlara nesne oluşturmadan erişebiliriz.

    static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

    }

    static int[] fill(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;

    }

    static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;

            }
        }
        return -1;
    }

}
