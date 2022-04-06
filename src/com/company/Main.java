package com.company;

public class Main {

    public static void main(String[] args) {

        mantiksalOperatorler();

    }

    public static void print() {
        System.out.println("Sa");
        System.out.println("Lorem\r ipsum dolor \b sit\t amet");

    }

    public static void degiskenlerDers1() {
        int numberOne, numberTwo = 2, numberThree;
        int a, b, c; // değer atanmak zorunda değildir.
        numberOne = 4;
        numberThree = numberOne + numberTwo;

        a = 1;
        b = 1;
        System.out.println(numberThree);
    }

    public static void degiskenlerDers11() {
        int kisaKenar = 5, uzunKenar = 20;
        int alan = (kisaKenar * uzunKenar) / 2;
        int cevre = (kisaKenar * uzunKenar) * 2; //formül olarak yanlış cos olmalıydı.

        System.out.println(alan);
        System.out.println(cevre);
    }

    public static void tamSayilar() {

        byte vByte = 100;
        short vShort = 1000;
        int vInt = 10000;
        long vLong = 910000000;

        System.out.println(vByte);
        System.out.println(vShort);
        System.out.println(vInt);
        System.out.println(vLong);
    }

    public static void floatAndDouble() {

        float vFloat = 3.14f;
        System.out.println(vFloat); // 1 şeklinde atanan değer,
        // 1.0 şeklinde çıktı verir.


        double vDouble = 3;
        System.out.println(vDouble);


    }

    public static void charAndBoolean() {

        char vChar = 'b';
        char vCharNumber = 98;

        System.out.println(vChar);
        System.out.println(vCharNumber);

        char c1 = 'J';
        char c2 = 'A';
        char c3 = 'V';
        char c4 = 'A';

        System.out.println("" + c1 + c2 + c3 + c4); // ASCII KARAKTERLERİNİ YAN YANA YAZDI.
        System.out.println(c1 + c2 + c3 + c4); //ACII DEĞERLERİNİ TOPLADI


        //BOOLEAN

        boolean dogru = true;
        boolean yanlis = false;

        System.out.println(dogru);
        System.out.println(yanlis);

    }

    public static void stringVeriTipi() {

        String kelime = "Hasan";
        String kelime2 = "Akgün";
        String cumle = "HASAN AKGÜN VAR MIDIR ? İSTANBULUN SEFİRİ MİDİR?";

        System.out.println(kelime + " " + kelime2);
        System.out.println(cumle);
    }

    public static void temelOperatorler() {

//        byte b = 0;
//        int a = b++;
//        System.out.print(a);

//        int a = 5, b = 1;
//        System.out.println(a+b);
//        System.out.println(a*b);
//        System.out.println(a-b);
//        System.out.println(a/b);
//        System.out.println(a%b);

        int a = 5, b = 1;

        b += a;
        b -= a;
        b /= a;
        b *= a;

        System.out.println(a);
        System.out.println(b);


    }

    public static void karsilastirmaOperatorleri() {

        int a = 5, b = 2;
        boolean esitDegilMi = (a != b);
        boolean esitMi = (a == b);
        boolean kucukMu = (a < b);
        boolean buyukMU = (a > b);

        System.out.println(esitDegilMi);
        System.out.println(esitMi);

    }

    public static void mantiksalOperatorler() {

        int a = 5, b = 6, c = 5;
        boolean kosul1 = a == c; // true
        boolean kosul2 = a >= b; // false

        boolean sonuc = kosul1 || kosul2; // true

        boolean sonuc2 = (a == c) || (a >= b);

        System.out.println(!sonuc); // !true = false

        System.out.println(sonuc2);


    }


}



