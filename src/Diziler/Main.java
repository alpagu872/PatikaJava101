package Diziler;

public class Main {

    static int[] reverse(int[] list) {

        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }

        return reverse;
    }

    static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }


    public static void main(String[] args) {

        String[] days = {"PAZAR", "PAZARTESİ", "SALI", "ÇARŞAMBA", "PERŞEMBE", "CUMA"};

        String[] weekednDays = new String[]{"CUMARTESİ", "PAZAR"};

    }


    static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
