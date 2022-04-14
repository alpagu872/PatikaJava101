package SayiTahminOyunu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner girdi = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        while (right < 5) {

            System.out.println("Lütfen Tahmininizi Giriniz: ");
            selected = girdi.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Bir sonraki aralık dışı veri girişinizde hakkınızdan düşülecektir.");
                } else {
                    right++;
                    System.out.println("Eh be adam!" + " Kalan hak: " + (5 - right));
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler Doğru Tahmin. " + "Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            } else {
                wrong[right] = selected;
                right++;
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız: " + (5 - right));
            }

        }
        if (!isWrong) {
            System.out.println("Denediğiniz sayılar: " + Arrays.toString(wrong));
        }
        if (isWin) {
            System.out.println("TEBRİKLER KAZANDINIZ.");
        } else {
            System.out.println("Kaybettiniz, doğru sayı: " + number);
        }

        //int number = (int) (Math.random() * 100);
    }
}
