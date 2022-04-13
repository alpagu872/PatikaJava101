package Diziler;

import java.util.Arrays;
import java.util.Scanner;

public class DizilerOrt {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;

    }

    static boolean isSame(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int counter = 0;
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {
                if ((list[i] == list[j])) {
                    counter++;

                }
            }
            if (!isSame(duplicate, list[i])) {
                duplicate[startIndex++] = list[i];
                System.out.println(list[i] + " Sayısı " + counter + " defa tekrar edildi.");
            }
            counter = 0;
        }
    }

    static void printList(int[] arr) { //KULLANILMADI
        System.out.println("Dizi: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void siralama(int[] arr) {
        int temp = 0;
        System.out.println("Sırali Liste: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
            System.out.print(arr[i] + " ");
        }
    }

    static void calcAverage(int[] arr) {
        int total = 0, average;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        average = total / arr.length;

        System.out.println(average);
    }

    static void harmonikOrt(int[] arr) {
        float total = 0;
        float sonuc;
        for (int i = 0; i < arr.length; i++) {
            total += 1.0 / arr[i];
        }
        sonuc = arr.length / total;
        System.out.println(sonuc);

    }

    static void minAndMaxValue(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }

    static void enYakinDeger(int[] arr, int value) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                System.out.println("En Yakın Büyük: " + arr[i - 1]);
                System.out.println("En Yakın Küçük: " + arr[i]);
                break;
            }
        }

    }

    static void cokBoyutluDizilerIleAHarfiCizmek() {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {

                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String[] row : letter) {
            for (String column : row) {
                System.out.print(column);
            }
            System.out.println();
        }


    }


    static void dizibefore() {
        int[] list = {3, 7, 3, 3, 2, 2, 5, 6, 6, 6, 8, 8, 8, 10, 10, 10, 9, 9, 10, 21, 1, 33, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }

        }

        for (int value : duplicate) {
            if (value != 0 && (value % 2 == 0)) {
                System.out.print(value + " ");
            }
        }

    }


}
