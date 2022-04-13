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

    public static void main(String[] args) {

        int[] list = {3, 7, 3, 3, 2, 9, 9, 10, 21, 1, 33, 1};
        int[] duplicate = new int[list.length];
        int statIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[statIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");

            }
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

}
