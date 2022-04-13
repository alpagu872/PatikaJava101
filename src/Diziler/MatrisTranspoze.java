package Diziler;

import java.util.Arrays;

public class MatrisTranspoze {
    public static void main(String[] args) {
        int[][] matris = {
                {2, 3, 4},
                {5, 6, 4},
        };

        int[][] matrisTranspoze = new int[3][2];//halihazırda elimdeki veriyi bildiğim için doğrudan boyutu elimle belirttim.
        for (int i = 0; i < matrisTranspoze.length; i++) {
            for (int j = 0; j < matrisTranspoze[i].length; j++) {
                matrisTranspoze[i][j] =  matris[j][i] ;//transpoze alma
            }
        }
        System.out.println(Arrays.deepToString(matrisTranspoze));// Ekrana yazdırma
    }
}
