package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        manavKasaProgrami();

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

        boolean sonuc2 = (a == c) || (a >= b); // true

        System.out.println(!sonuc); // !true = false

        System.out.println(sonuc2);

        String str = ((sonuc) ? "Doğru" : "Yanlış");
        System.out.println(str);


    }

    public static void kullanicidanVeriAlma() {
        int a;
        Scanner girdi = new Scanner(System.in); // Sınıftan nesne tanımlama

        String str = girdi.nextLine();

        System.out.println("Input String: " + str);


    }

    public static void notOrtHesaplayanProg() {
        int matNot, fizikNot, kimyaNot, turkceNot, tarihNot, muzikNot;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matNot = girdi.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizikNot = girdi.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimyaNot = girdi.nextInt();

        System.out.println("Türkçe Notunuz ");
        turkceNot = girdi.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarihNot = girdi.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzikNot = girdi.nextInt();

        float toplam = (matNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot);
        float sonuc = (float) (toplam / 6.0);
        System.out.println("Ortalamanız: " + sonuc);
    }

    public static void notOrtHesaplayanProgUpgrade() {
        int matNot, fizikNot, kimyaNot, turkceNot, tarihNot, muzikNot;
        Scanner girdi = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matNot = girdi.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizikNot = girdi.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimyaNot = girdi.nextInt();

        System.out.println("Türkçe Notunuz ");
        turkceNot = girdi.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarihNot = girdi.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzikNot = girdi.nextInt();

        float toplam = (matNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot);
        float sonuc = (float) (toplam / 6.0);

        System.out.println("Ortalamanız: " + sonuc);
        String gecti = sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gecti);

    }

    public static void kdvTutariHesaplayanProg() {
        Scanner girdi = new Scanner(System.in);
        int eldeki = girdi.nextInt();

        float kdvliFiyat, kdv;
        kdv = (float) (eldeki * 0.18);
        kdvliFiyat = eldeki + kdv;
        System.out.println("KDV'siz Fiyat= " + eldeki);
        System.out.println("KDV'li Fiyat= " + kdvliFiyat);
        System.out.println("KDV tutarı= " + kdv);


    }

    public static void kdvTutariHesaplayanProgUpgrade() {
        Scanner girdi = new Scanner(System.in);
        int eldeki = girdi.nextInt();

        float kdvliFiyat, kdv, kdvOran;
        kdvOran = (float) ((eldeki < 1000) ? 0.18 : 0.08);
        kdv = eldeki * kdvOran;
        kdvliFiyat = eldeki + kdv;


        System.out.println("KDV'siz Fiyat= " + eldeki);
        System.out.println("KDV'li Fiyat= " + kdvliFiyat);
        System.out.println("KDV tutarı= " + kdv);
        System.out.println(kdvOran);


    }

    public static void dikUcgendeHipBulanProg() {
        int a, b;
        float hipotenus;

        Scanner girdi = new Scanner(System.in);
        a = girdi.nextInt();
        b = girdi.nextInt();

        hipotenus = (float) Math.sqrt((a * a) + (b * b));

        double u = (a + b + hipotenus) / 2;
        double cevre = (2 * u);
        double alan = u * (u - a) * (u - b) * (u - hipotenus);
        System.out.println(hipotenus);
        System.out.println(cevre);
        System.out.println(alan);
    }

    public static void taksimetreHesaplayanProg() {
        float mesafe, kmBasi, tutar, minUcret, acilisUcret;
        Scanner girdi = new Scanner(System.in);

        mesafe = girdi.nextInt();
        kmBasi = 2.2f;
        acilisUcret = 10f;

        tutar = ((acilisUcret+kmBasi*mesafe) > 20 ) ? (acilisUcret+kmBasi*mesafe) : 20;

        System.out.println(tutar);
    }

    public static void daireninAlaniVeCevresiniBulanProg(){
        double alinanCap, alan,cevre,merkezAciOlcusu,daireDilimAlan;
        Scanner girdi = new Scanner(System.in);
        alinanCap = girdi.nextDouble();

        merkezAciOlcusu = girdi.nextDouble();

        alan = Math.PI*(alinanCap*alinanCap);
        cevre = 2* Math.PI *alinanCap;
        daireDilimAlan = (Math.PI*(alinanCap*alinanCap) *merkezAciOlcusu)/360;

        System.out.println("Alan= " + alan);
        System.out.println("Çevre= " + cevre);
        System.out.println("Daire Diliminin Alanı:" + daireDilimAlan);


    }

    public static void vucutKitleEndeksi(){
        Scanner girdi = new Scanner(System.in);
        float boy,kilo,sonuc;

        boy = girdi.nextFloat();
        kilo = girdi.nextFloat();

        sonuc = kilo / (boy*boy);

        System.out.println(sonuc);
    }

    public static void manavKasaProgrami(){
        Scanner girdi = new Scanner(System.in);

        float armutKg,elmaKg,domatesKg,muzKg,patlicanKg;

        System.out.println("Armut Kaç Kilo ? ");
        armutKg = girdi.nextFloat();
        System.out.println("elma Kaç Kilo ? ");
        elmaKg = girdi.nextFloat();
        System.out.println("domates Kaç Kilo ? ");
        domatesKg = girdi.nextFloat();
        System.out.println("muz Kaç Kilo ? ");
        muzKg = girdi.nextFloat();;
        System.out.println("patlican Kaç Kilo ? ");
        patlicanKg = girdi.nextFloat();


        float tutar = (float) ((armutKg*2.14)+(elmaKg*3.67)+(domatesKg*1.11)+(muzKg*0.95)+(patlicanKg*5));
        System.out.println(tutar);

    }
}



