package MineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    static void play() {
        int hamleSayisi = 0, hata = 0;
        Scanner girdi = new Scanner(System.in);

        System.out.println("A:");
        int mSayi1 = girdi.nextInt();

        System.out.println("B:");
        int mSayi2 = girdi.nextInt();

        char[][] bomba = new char[mSayi1][mSayi2];
        char[][] oyun = new char[mSayi1][mSayi2];
        char[][] acilan = new char[mSayi1][mSayi2];

        MineSweeper.bombaOlustur(mSayi1, mSayi2, bomba);
        for (int i = 0; i < mSayi1; i++) {
            for (int j = 0; j < mSayi2; j++) {
                oyun[i][j] = '-';
            }
        }
        while (hamleSayisi < ((mSayi1 * mSayi2) - (mSayi1 * mSayi2 / 4))) {
            System.out.println("Satır:");
            int n1 = girdi.nextInt();

            System.out.println("Sütun:");
            int n2 = girdi.nextInt();
            if (n1 >= mSayi1 || n2 >= mSayi2) {
                System.out.println("Yanlış girdi!");
            } else {
                hata = MineSweeper.bombalariBul(n1, n2, bomba, acilan, oyun);
                if (hata == 1) {
                    System.out.println("Mayına bastın.");
                    break;

                }
                MineSweeper.oyunuCiz(mSayi1, mSayi2, bomba, acilan, oyun, n1, n2);
                hamleSayisi++;
            }

        }
        if (hata != 1) {
            System.out.println("Kazandın!");
        }

    }

    static void oyunuCiz(int sayi1, int sayi2, char[][] bomba, char[][] acilan, char[][] oyun, int n1, int n2) {
        for (int i = 0; i < sayi1; i++) {
            for (int j = 0; j < sayi2; j++) {
                System.out.print(oyun[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void bombaOlustur(int mSayi1, int mSayi2, char[][] bomba) {

        Random rand = new Random();
        //bomba sayısı hesaplama
        int bombaSayisi = mSayi1 * mSayi2 / 4;
        //bomba alanı oluşturma
        int[] t_bombaAlani = new int[bombaSayisi];
        for (int i = 0; i < mSayi1; i++) {
            for (int j = 0; j < mSayi2; j++) {
                bomba[i][j] = '-';
            }
        }
        for (int i = 0; i < bombaSayisi; i++) {
            int t1 = rand.nextInt(mSayi1);
            int t2 = rand.nextInt(mSayi2);
            if (Arrays.asList(t_bombaAlani).contains(t1)) {
                if (t_bombaAlani[t1] == t2) {
                    bombaSayisi++;
                } else {
                    bomba[t1][t2] = 'X';
                }
            } else {
                bomba[t1][t2] = 'X';
            }
        }
        System.out.println("Bomba");
        for (int i = 0; i < mSayi1; i++) {
            for (int j = 0; j < mSayi2; j++) {
                System.out.print(bomba[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Bomba");
    }

    static int bombalariBul(int n1, int n2, char[][] bomba, char[][] acilan, char[][] oyun) {
        int sayac = 0;

        for (int a = 0; a < oyun.length; a++) {
            for (int b = 0; b < oyun[0].length; b++) {
                if (bomba[a][b] == 'X') {
                    if (n1 == a && n2 == b) return 1;
                    else if (n1 - 1 == a && n2 == b) sayac++;
                    else if (n1 == a && n2 == b + 1) sayac++;
                    else if (n1 == a && n2 == b - 1) sayac++;
                    else if (n1 + 1 == a && n2 == b) sayac++;
                }
            }
        }
        System.out.println("Sayaç: " + sayac);
        System.out.println("Sayac karakter: " + Character.forDigit(sayac, 10));
        if (sayac > 0) oyun[n1][n2] = (Character.forDigit(sayac, 10));
        else oyun[n1][n2] = '0';
        return 0;
    }
}

