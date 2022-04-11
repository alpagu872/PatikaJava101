package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


    }

    public static int desen(int n) {
        System.out.println(n);

        if (n <= 0) {
            return n;
        } else {
            desen(n - 5);
            System.out.println(n);
        }
        return n;
    }

    public static void test() {


    }

    public static void print1() {
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

        tutar = ((acilisUcret + kmBasi * mesafe) > 20) ? (acilisUcret + kmBasi * mesafe) : 20;

        System.out.println(tutar);
    }

    public static void daireninAlaniVeCevresiniBulanProg() {
        double alinanCap, alan, cevre, merkezAciOlcusu, daireDilimAlan;
        Scanner girdi = new Scanner(System.in);
        alinanCap = girdi.nextDouble();

        merkezAciOlcusu = girdi.nextDouble();

        alan = Math.PI * (alinanCap * alinanCap);
        cevre = 2 * Math.PI * alinanCap;
        daireDilimAlan = (Math.PI * (alinanCap * alinanCap) * merkezAciOlcusu) / 360;

        System.out.println("Alan= " + alan);
        System.out.println("Çevre= " + cevre);
        System.out.println("Daire Diliminin Alanı:" + daireDilimAlan);


    }

    public static void vucutKitleEndeksi() {
        Scanner girdi = new Scanner(System.in);
        float boy, kilo, sonuc;

        boy = girdi.nextFloat();
        kilo = girdi.nextFloat();

        sonuc = kilo / (boy * boy);

        System.out.println(sonuc);
    }

    public static void manavKasaProgrami() {
        Scanner girdi = new Scanner(System.in);

        float armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        System.out.println("Armut Kaç Kilo ? ");
        armutKg = girdi.nextFloat();
        System.out.println("elma Kaç Kilo ? ");
        elmaKg = girdi.nextFloat();
        System.out.println("domates Kaç Kilo ? ");
        domatesKg = girdi.nextFloat();
        System.out.println("muz Kaç Kilo ? ");
        muzKg = girdi.nextFloat();
        System.out.println("patlican Kaç Kilo ? ");
        patlicanKg = girdi.nextFloat();


        float tutar = (float) ((armutKg * 2.14) + (elmaKg * 3.67) + (domatesKg * 1.11) + (muzKg * 0.95) + (patlicanKg * 5));
        System.out.println(tutar);

    }

    public static void karsilastirmaOp2() {

        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;

        //EŞİTLİK OPERATÖRÜ

        System.out.println(A == C);
        System.out.println(A == B);
        System.out.println(C == D);
        System.out.println();
        //EŞİT DEĞİL OPERATÖRÜ

        System.out.println(A != B);
        System.out.println(A != C);
        System.out.println(C != B);

        //BÜYÜKTÜR OPERATÖRÜ
        System.out.println();

        System.out.println(A > D);
        System.out.println(B > C);
        System.out.println(A > B);
        System.out.println();

        //BÜYÜK EŞİTTİR OPERATÖRÜ

        System.out.println(A >= B);
        System.out.println(B >= D);
        System.out.println(C >= A);
        System.out.println();

        //KÜÇÜKTÜR OPERATÖRÜ

        System.out.println(A < B);
        System.out.println(B < C);
        System.out.println(C < A);
        System.out.println();

        //KÜÇÜK EŞİTTİR OPERATÖRÜ

        System.out.println(A <= B);
        System.out.println(C <= A);
        System.out.println(B <= C);
        System.out.println();


    }

    public static void kosulluIfadelerKodBloklari() {

        int a = 10, b = 20, c = 10, d;

        boolean kosul1 = (a > b);

        boolean kosul2 = (a > c);

        boolean veSonuc = kosul1 && kosul2;
        boolean veyaSonuc = kosul1 || kosul2;

        System.out.println(kosul1);
        System.out.println(kosul2);

        System.out.println("Sonuc: " + veSonuc);
        System.out.println("Veya sonuc: " + veyaSonuc);

        d = (a == b) ? 30 : 20;

        System.out.println(d);

    }

    public static void kodBloklari() {

        int a = 5;
        System.out.println(a);


    }

    public static void ifElse() {

        int a = 10, b = 20;
        boolean compare = (a == b);

//        System.out.println(compare);
//
//        String str = compare == true ? "Eşittir" : "Eşit değildir";
//        System.out.println(str);


        if (!compare) {
            a = 50;
            System.out.println("A sayısı: " + a);
            System.out.println("DOĞRUDUR");
        } else {
            System.out.println("YANLIŞTIR");
        }
    }

    public static void ifElse2() {

        int a = 10, b = 20, c = 1;
        if ((a < b) && (a < c)) {
            System.out.println("A en küçüktür.");
        } else if (c < b) {
            System.out.println("B ortancadır.");
        } else {
            System.out.println("c en küçüktür");
        }


    }

    public static void switchCase() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen 1 veya 2'yi seçiniz.");
        int a = girdi.nextInt();


        switch (a) {
            case 1:
                System.out.println("SA AS");
                break;
            case 2:
                System.out.println("AS SA");
                break;
            default:
                System.out.println("Lütfen 1 veya 2'yi seçiniz.");
                switchCase();

        }


    }

    public static void switchCaseHesapMakinesi() {
        Scanner girdi = new Scanner(System.in);
        System.out.println("1-TOPLAMA \n" + "2-ÇIKARMA\n" + "3-ÇARPMA\n" + "4-BÖLME");
        int a = girdi.nextInt();
        int n1, n2;

        System.out.println("İlk sayıyı giriniz: ");
        n1 = girdi.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = girdi.nextInt();


        switch (a) {

            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println((float) n1 / n2);
                break;
            default:
                System.out.println("Geçersiz işlem");
                switchCaseHesapMakinesi();

        }


    }

    public static void ifElseHesapMakinesi() {
        int n1, n2, secim;
        Scanner girdi = new Scanner(System.in);

        System.out.println("1-TOPLAMA \n" + "2-ÇIKARMA\n" + "3-ÇARPMA\n" + "4-BÖLME");

        secim = girdi.nextInt();

        System.out.println("İlk Sayı ");
        n1 = girdi.nextInt();
        System.out.println("İkinci Sayı");
        n2 = girdi.nextInt();

        if (secim == 1) {
            System.out.println(n1 + n2);
        } else if (secim == 2) {
            System.out.println(n1 - n2);
        } else if (secim == 3) {
            System.out.println(n1 * n2);
        } else if (secim == 4) {
            if (n2 != 0) System.out.println((float) n1 / n2);
            else {
                System.out.println("Sıfıra bölünemez.");
            }
        } else {
            System.out.println("Geçersiz İşlem!");
            ifElseHesapMakinesi();
        }


    }

    public static void kullaniciGirisi() {
        Scanner girdi = new Scanner(System.in);
        String username, password;

        System.out.println("Kullanıcı adınız:");
        username = girdi.nextLine();

        System.out.println("Şifreniz:");
        password = girdi.nextLine();

        if ((username.equals("Alpagu")) && (password.equals("123"))) {
            System.out.println("Başarıyla giriş yapıldı...\n" + "Yönlendiriliyorsunuz...");

        } else if (!(password.equals("123")) && !(username.equals("Alpagu"))) {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış, tekrar deneyiniz.");
            kullaniciGirisi();
        } else if (!(password.equals("123"))) {
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");

            System.out.println("1-HAYIR\n" + "2-EVET");
            int secim = girdi.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Giris ekranına yönlendiriliyorsunuz.");
                    kullaniciGirisi();
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama ekranına yönlendiriliyorsunuz.");
                    sifreSifirlama("123");
                    break;
                default:
                    kullaniciGirisi();
                    break;
            }
        }


    }

    public static String sifreSifirlama(String inputPass) {
        Scanner girdi = new Scanner(System.in);

        String yeniSifre;

        System.out.println("Yeni şifrenizi giriniz:");
        yeniSifre = girdi.nextLine();
        if (yeniSifre.equals(inputPass)) {
            System.out.println("Şifre oluşturulamadı, Lütfen farklı bir şifre deneyiniz.");
            sifreSifirlama(inputPass);
        } else {
            System.out.println("Yeni şifreniz oluşturuldu.\n" + "Giriş ekranına yönlendiriliyorsunuz....");
        }
        kullaniciGirisi();
        return yeniSifre;

    }

    public static void sinifiGecmeDurumu() {
        Scanner girdi = new Scanner(System.in);
        int sayac = 0, toplam = 0, ortalama;

        int mat, fizik, turkce, kimya, muzik;


        System.out.println("Matematik notunuz:");
        mat = girdi.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            sayac++;
        }
        System.out.println("Fizik notunuz:");
        fizik = girdi.nextInt();
        if (fizik >= 0 && fizik <= 100) {

            toplam += fizik;
            sayac++;
        }
        System.out.println("Türkçe notunuz:");
        turkce = girdi.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            sayac++;
        }
        System.out.println("Kimya notunuz:");
        kimya = girdi.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            sayac++;
        }
        System.out.println("Müzik notunuz:");
        muzik = girdi.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            sayac++;
        }
        if (sayac == 0) {
            System.out.println("Geçersiz ders sayısı");

        } else {
            ortalama = (toplam / sayac);
            if (ortalama <= 55) {
                System.out.println(ortalama + " ile sınıfta kaldınız.");
            } else {
                System.out.println(ortalama + " ile sınıfı geçtiniz.");
            }

        }


    }

    public static void havaSicakliginaGoreEtkinlikOnerisi() {
        int sicaklik;
        Scanner girdi = new Scanner(System.in);
        sicaklik = girdi.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak");
        } else if (sicaklik > 5 && sicaklik < 15) {
            System.out.println("Sinema");
        } else if (sicaklik > 15 && sicaklik < 25) {
            System.out.println("Piknik");
        } else if (sicaklik > 25) {
            System.out.println("Yüzme");
        }


    }

    public static void sayilariBuyuktenKucugeSiralama() {

        Scanner girdi = new Scanner(System.in);

        int a, b, c;
        a = girdi.nextInt();
        b = girdi.nextInt();
        c = girdi.nextInt();
        if ((a < c) && (a < b)) {
            if (b < c) {
                System.out.println(a + "<" + b + "<" + c);
            } else {
                System.out.println(a + "<" + c + "<" + b);
            }
        } else if ((b < c) && (b < a)) {
            if (a < c) {
                System.out.println(b + "<" + a + "<" + c);
            } else {
                System.out.println(b + "<" + c + "<" + a);
            }
        } else if ((c < a) && (c < b)) {
            if (b < a) {
                System.out.println(c + "<" + b + "<" + a);
            } else {
                System.out.println(c + "<" + a + "<" + b);
            }

        }

    }

    public static void burcBulanProg() {

        int month, day;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Doğduğunuz ay: ");
        month = girdi.nextInt();

        System.out.println("Doğduğunuz gün: ");
        day = girdi.nextInt();

        switch (month) {
            case 1:
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        System.out.println("Oğlak Burcu");
                    } else {
                        System.out.println("Kova Burcu");
                    }
                }
                break;

            case 2:
                if (1 <= day && day <= 28) {
                    if (day < 19) {
                        System.out.println("Kova Burcu");
                    } else {
                        System.out.println("Balık Burcu");
                    }
                }
                break;
            case 3:
                if (1 <= day && day <= 31) {
                    if (day < 20) {
                        System.out.println("Balık Burcu");
                    } else {
                        System.out.println("Koç Burcu");

                    }
                }
                break;
            case 4:
                if (1 <= day && day <= 30) {
                    if (day < 21) {
                        System.out.println("Koç Burcu");
                    } else {
                        System.out.println("Boğa Burcu");
                    }
                }
                break;
            case 5:
                if (1 <= day && day <= 29) {
                    if (day < 21) {
                        System.out.println("Boğa Burcu");
                    } else {
                        System.out.println("İkizler Burcu");
                    }
                }
                break;
            case 6:
                if (1 <= day && day <= 30) {
                    if (day < 22) {
                        System.out.println("İkizler Burcu");
                    } else {
                        System.out.println("Yengeç Burcu");
                    }
                }
                break;
            case 7:
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        System.out.println("Yengeç Burcu");
                    } else {
                        System.out.println("Aslan Burcu");
                    }
                }
                break;
            case 8:
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        System.out.println("Aslan Burcu");
                    } else {
                        System.out.println("Başak Burcu");
                    }
                }
                break;
            case 9:
                if (1 <= day && day <= 30) {
                    if (day < 23) {
                        System.out.println("Başak Burcu");
                    } else {
                        System.out.println("Terazi Burcu");
                    }
                }
                break;
            case 10:
                if (1 <= day && day <= 30) {
                    if (day < 22) {
                        System.out.println("Terazi Burcu");
                    } else {
                        System.out.println("Akrep Burcu");
                    }
                }
                break;
            case 11:
                if (1 <= day && day <= 30) {
                    if (day < 21) {
                        System.out.println("Akrep Burcu");
                    } else {
                        System.out.println("Yay Burcu");
                    }
                }
                break;
            case 12:
                if (1 <= day && day <= 31) {
                    if (day < 21) {
                        System.out.println("Yay Burcu");
                    } else {
                        System.out.println("Oğlak Burcu");
                    }
                }
                break;

            default:
                System.out.println("Hatalı giriş.");
                break;
        }


    }

    public static void hackerrankIfElse() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else if (n >= 2 && n <= 5) {
            ans = "Not Weird";
        } else if (n >= 6 && n <= 20) {
            ans = "Weird";
        } else if (n > 20) {
            ans = "Not Weird";
        }

        System.out.println(ans);
    }

    public static void ucakBiletiHesaplama() {
        Scanner girdi = new Scanner(System.in);

        float toplam, km, yasIndirimi = 1, kmF = 0.1f, yonIndirimi = 1;
        int yas, gidisGelis = 1;

//        //inputlar
//        //inputlar
//        //inputlar
//
//        if (//şart kontrolü)
//        else{
//            //koşullara göre yeni değişken değerlerinin belirlenmesi
//
//            //total hesap
//            //kapanış
//        }
        System.out.println("Yaşınız:");
        yas = girdi.nextInt();

        System.out.println("Km cinsinden gideceğiniz mesafe;");
        km = girdi.nextInt();

        System.out.println("1-TEK YÖN \n" + "2-GİDİŞ GELİŞ");

        gidisGelis = girdi.nextInt();

        if (yas < 0 || km < 0 || (gidisGelis != 1 && gidisGelis != 2)) {
            System.out.println("Yanlış Değer Girişi");
        } else {
            if (yas < 12) {
                yasIndirimi = 0.5f;
            } else if (12 < yas && yas < 24) {
                yasIndirimi = 0.9f;
            } else if (yas > 65) {
                yasIndirimi = 0.7f;
            }
            if (gidisGelis == 2) {
                yonIndirimi = 1.6f;

            }
            toplam = km * kmF * yasIndirimi * yonIndirimi;
            System.out.println(toplam);
        }
    }

    public static void cinZodyagi() {
        Scanner girdi = new Scanner(System.in);
        int yil, zodyak;
        yil = girdi.nextInt();

        zodyak = yil % 12;

        if (zodyak == 0) {
            System.out.println("Maymun");

        } else if (zodyak == 1) {
            System.out.println("Horoz");

        } else if (zodyak == 2) {
            System.out.println("Köpek");

        } else if (zodyak == 3) {
            System.out.println("Domuz");

        } else if (zodyak == 4) {
            System.out.println("Fare");

        } else if (zodyak == 5) {
            System.out.println("Öküz");

        } else if (zodyak == 6) {
            System.out.println("Kaplan");

        } else if (zodyak == 7) {
            System.out.println("Tavşan");

        } else if (zodyak == 8) {
            System.out.println("Ejderha");

        } else if (zodyak == 9) {
            System.out.println("Yılan");

        } else if (zodyak == 10) {
            System.out.println("At");


        } else if (zodyak == 11) {
            System.out.println("Koyun");

        } else {
            System.out.println("Yanlış input");
        }

    }

    public static void artikYilHesaplama() {
        Scanner girdi = new Scanner(System.in);

        int yil;
        boolean artikYil;

        yil = girdi.nextInt();
        if (yil % 100 == 0) {
            artikYil = (yil % 400 == 0);
            if (artikYil == true) {
                System.out.println(yil + " artik yildir.");
            } else {
                System.out.println(yil + " artık yıl değildir.");

            }

        } else if (yil % 4 == 0) {
            System.out.println(yil + " artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl değildir.");
        }

    }

    public static void whileDongusu() {

        int i = 0;
        int k = 1;
        while (i < 5) {
            System.out.println(i);

            while (k <= 10) {
                System.out.print(k + ", ");
                k++;
            }
            System.out.println();
            i++;

        }
    }

    public static void ortaBulma() {

        int left = 100, right = 200;
        while (++left < --right) {
        }
        System.out.println(left);
    }

    public static void passCheckWhile() {
        Scanner girdi = new Scanner(System.in);
        int password = 123456;

        boolean isPasswordSuccess = true;

        while (isPasswordSuccess) {
            System.out.println("Şifrenizi giriniz:");
            int inpPass = girdi.nextInt();

            if (password == inpPass) {
                isPasswordSuccess = false;
                System.out.println("Başarıyla giriş yapıldı...");

            } else {
                System.out.println("Şifreniz yanlış, tekrar deneyin...");


            }

        }

    }

    public static void doWhile() {
        int yil = 2021;
        do {
            System.out.println(yil);
            yil++;
        } while (yil < 2029);

    }

    public static void doWhilePassCheck() {
        Scanner girdi = new Scanner(System.in);
        int pass;
        boolean askPass = true;

        do {
            System.out.println("Şifrenizi giriniz: ");
            pass = girdi.nextInt();
            if (pass == 1133) {
                System.out.println("Şifreniz doğru.");
                askPass = false;
            } else {
                System.out.println("Yanlış şifre!");
            }
        } while (askPass);

        //
        int i = 1, j = 1;
        while (i < 3) {
            do {
                System.out.print(j + ",");
                j++;

            } while (j < 4);


            i++;
        }

    }

    public static void forDongusu() {
        for (int sayac = 1; sayac <= 10; sayac++) {
            System.out.print(sayac + " ");
        }

        System.out.println();

        int k = 1;
        while (k <= 10) {
            System.out.print(k + " ");
            k++;
        }


    }

    public static void forAndWhileConc() {
        Scanner girdi = new Scanner(System.in);

        int sayi;
        /*

        for (boolean run = true; run;){
            System.out.println("Sayi giriniz:");
            sayi = girdi.nextInt();
            if (sayi < 0){
                run = false;
            }*/

        boolean run = true;


//        while (run) {
//            System.out.println("Sayı giriniz:");
//            sayi = girdi.nextInt();
//
//            if (sayi < 0) {
//                run = false;
//            }
//        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }


    }

    public static void continueAndBreak() {

//        for (int i = 1 ; i <= 10 ; i++){
//            if (i==5){
//                break;
//            }
//            System.out.println(i);
//        }//break
//
//        for (int i = 1 ; i <= 10; i++){
//
//            if (i == 5){
//                continue;
//            }
//
//            System.out.println(i);
//        } //continue

        System.out.println();
        System.out.println();

        int i = 1;
        while (i <= 10) {
            i++;

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);


        }
    }

    public static void eKadarCiftSayiBulanProg() {


//        for (int i = 0; i < sayi; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i + ",");
//            }
//        }
        Scanner girdi = new Scanner(System.in);

        int sayi;
        int toplam = 0, sayac = 0, ort;

        System.out.println("Sayiyi giriniz: ");
        sayi = girdi.nextInt();


        for (int i = 1; i < sayi; i++) {

            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                sayac++;
                System.out.println(i);
            }


        }
        ort = toplam / sayac;
        System.out.println("Ortalama: " + ort);


    }

    public static void girilenTekSayilarinTop() {

        Scanner girdi = new Scanner(System.in);

        int deger, toplam = 0;
        do {
            System.out.println("Bir sayı giriniz: ");
            deger = girdi.nextInt();
            if (deger % 2 == 1) {
                toplam += deger;
            }

        } while (deger > 0);

        System.out.println("Toplam: " + toplam);
    }

    public static void tekSayiGirileneKadarCift() {

        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan
        // programı yazıyoruz.

        Scanner girdi = new Scanner(System.in);
        int deger, toplam = 0;

        do {
            System.out.println("Değer Giriniz: ");
            deger = girdi.nextInt();
            if (deger % 4 == 0) {
                toplam += deger;
            }

        } while (!(deger % 2 == 1));
        System.out.println("Toplam : " + toplam);

    }

    public static void girilenSayidanKucukIkininKuvvetleri() {

        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini
        // ekrana yazdıran programı yazıyoruz.

        Scanner girdi = new Scanner(System.in);


        System.out.println("Sayiyi giriniz: ");
        int sayi = girdi.nextInt();


        for (int i = 1; i <= sayi; i *= 2) {
            System.out.println(i);

        }

    }

    public static void kuvvetlerOdev() {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana
        // yazdıran programı yazıyoruz.

        Scanner girdi = new Scanner(System.in);

        int n = girdi.nextInt();

        for (int i = 1, j = 1; i <= n && j <= n; i *= 4, j *= 5) {
            System.out.println(i + ", " + j);

        }

    }

    public static void faktoriyelHesabi() {
        Scanner girdi = new Scanner(System.in);
        int n = girdi.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.println(n + "! = " + total);
    }

    public static void kombOdevi() {

        //Java ile kombinasyon hesaplayan program yazınız.

        Scanner girdi = new Scanner(System.in);
        System.out.println("N değerini giriniz: ");
        int n = girdi.nextInt();
        System.out.println("R değerini giriniz: ");
        int r = girdi.nextInt();


        int totaln = 1, totalr = 1;
        int nEksiRfak = 1;

        for (int i = 1; i <= n; i++) {
            totaln = totaln * i;
        }

        for (int j = 1; j <= r; j++) {
            totalr = totalr * j;
        }

        for (int i = 1; i <= n - r; i++) {
            nEksiRfak *= i;
        }

        double komb = (totaln) / ((totalr) * (nEksiRfak));

        System.out.println(komb);
    }

    public static void usluSayiHesaplayanProg() {

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
        // yazıyoruz.

        Scanner girdi = new Scanner(System.in);

        int n = girdi.nextInt();
        int k = girdi.nextInt();
        int sonuc = 1;
        while (k != 0) {
            sonuc *= n;
            k--;

        }
        System.out.println(sonuc);
    }

    public static void usluSayiHesapFor() {
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı
        // "For Döngüsü" kullanarak yapınız.

        Scanner girdi = new Scanner(System.in);
        int n, k, sonuc = 1;
        n = girdi.nextInt();
        k = girdi.nextInt();

        for (int i = k; i != 0; i--) {
            sonuc *= n;
        }
        System.out.println(sonuc);

    }

    public static void armstrongSayi() {



        /*Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı
        yazıyoruz.

    Armstrong Sayı Nedir ?
    N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
    sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

    Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
    Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

    1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit
    olmadığı için armstrong sayı olmaz.

    1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

    54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748

        */
        // BAŞLA
        // Sayının basamak sayısını bul
        // N BASAMAKLI BİR SAYININ N'İNCİ SAYISINI BUL.
        // N BASAMAKLI BİR SAYININ N'İNCİ ÜSTLERİNİN TOPLAMINI BUL
        // N'İNCİ ÜSTLERİNİN TOPLAMI SAYININ KENDİSİNE EŞİT Mİ KONTROL ET.
        // EŞİTSE TRUE DEĞİL İSE FALSE DÖNDÜR
        // BİTİR.

//        int girilenSayi = 24451;
//
//        int basamakSayisi = 0;

        // BASAMAK SAYISI BULMA İŞLEMİ
        // 2451 / 10 = 245 (int)
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0

//
//        while (girilenSayi != 0) {
//
//            girilenSayi /=  10;
//            basamakSayisi += 1;
//
//        }

        // sayinin üssünü alma

//        int sayi = 5;
//        int us = 3;
//        int sonuc= 1;
//        for (int i = 1 ; i <= us ; i++){
//            sonuc *= sayi;
//
//        }

        // N BASAMAKLI BİR SAYININ N'İNCİ SAYISINI BUL.

        // a % 10 bize n'inci basamağı verir.
        //  System.out.println( 24451%10);

        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int girilenSayi = girdi.nextInt();

        //basamak sayisinin hesaplanmasi

        int basamakSayisi = 0, tempGirilenSayi = girilenSayi; // Girilen değeri kaybetmemek için oluşturulan gecici değişken.
        int basamakDegeri;
        int sonuc = 0, usluSonuc; //global ve lokal değişken kritik bir durum, eğer ilk 1 atamasını burada yapıp while içinde
        // lokal olarak yapmaz iseniz sonuc çıkmayacak.


        while (tempGirilenSayi != 0) {
            tempGirilenSayi /= 10;
            basamakSayisi++;
        }

        tempGirilenSayi = girilenSayi; // Değeri tekrar kullanmak için atamayı tekrar yapıyoruz.
        // tempGirilenSayi değişkeninin işlemden çıktıktan sonraki güncel değeri 0,
        // tekrar kullanabilmek için girilen değeri tekrardan atadık.


        //sonuncu basamağın değerini elde etmek için yazdığımız döngü

        while (tempGirilenSayi != 0) {
            basamakDegeri = tempGirilenSayi % 10;
            usluSonuc = 1;
            //basamağın üssünü aldığımız for döngüsü
            for (int i = 1; i <= basamakSayisi; i++) {
                usluSonuc *= basamakDegeri;
            }
            //günün sonunda her basamağın n'inci üssünü alıp değerlerini topladığımız değişken
            sonuc += usluSonuc;
            tempGirilenSayi /= 10;

        }

        if (sonuc == girilenSayi) {
            System.out.println(girilenSayi + " Bir armstrong sayısıdır.");
        } else {
            System.out.println(girilenSayi + " Bir armstrong sayısı değildir.");
        }

    }

    public static void basamakToplamaOdev() {

        //Ödev
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner girdi = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int girilenDeger = girdi.nextInt();
        int basamakToplam = 0;


        while (girilenDeger != 0) {
            int basamakDegeri = girilenDeger % 10;
            basamakToplam = basamakDegeri + basamakToplam;
            girilenDeger = girilenDeger / 10;
        }

        System.out.println(basamakToplam);
        //Kodu adım adım işletmek için;
        //https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+ClassNameHere+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++int+girilenDeger+%3D+258%3B%0A++++++++int+basamakToplam+%3D+0%3B%0A%0A%0A++++++++while+(girilenDeger+!%3D+0)+%7B%0A++++++++++++int+basamakDegeri+%3D+girilenDeger+%25+10%3B%0A++++++++++++basamakToplam+%3D+basamakDegeri+%2B+basamakToplam%3B%0A++++++++++++girilenDeger+%3D+girilenDeger+/+10%3B%0A++++++++%7D%0A%0A++++++++System.out.println(basamakToplam)%3B%0A+++%7D%0A%7D&mode=display&curInstr=0


    }

    public static void harmonikSayilariBulanProg() {

        // Java ile girilen sayının harmonik serisini bulan program yazacağız.
        //
        //Harmonik Seri Formülü : 1+ 1/2 + 1/3 + 1/4 + 1/5 + .... +  1 / n

        Scanner girdi = new Scanner(System.in);
        float girilenDeger = girdi.nextInt();
        double toplam = 0.0;

        for (float i = 1; i <= girilenDeger; i++) {
            toplam += (1 / i);
        }
        System.out.println(toplam);

    }

    public static void yildizlarIleUcgenCizimi() {
        Scanner girdi = new Scanner(System.in);
        int n = girdi.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }


            System.out.println();


        }


    }

    public static void yildizlarIleElmasOdev() {
        Scanner girdi = new Scanner(System.in);
        int yukseklik = girdi.nextInt(); //yükseklik hep tek sayi olacaktir
        int yariyukseklik = (int) (yukseklik / 2) + 1;

        for (int i = 0; i < yariyukseklik; i++) {
            for (int j = 1; j <= yariyukseklik - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
        //üst yarısı tamam
        for (int i = yariyukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yariyukseklik - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }

    }

    public static void atmProjesi() {
        Scanner girdi = new Scanner(System.in);
        String userName, password;
        int girisHakki = 3;
        int bakiye = 1500;
        int secim;

        while (girisHakki > 0) {
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName = girdi.nextLine();

            System.out.println("Şifrenizi giriniz: ");
            password = girdi.nextLine();

            if (userName.equals("Alpagu") && password.equals("123456")) {
                System.out.println("Giriş İşlemi Başarılı.\n" + "X Bankasına hoşgeldiniz.\n" + "Güncel Bakiyeniz:  " + bakiye);

                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: \n" + "1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula \n" + "4-Çıkış Yap");
                    secim = girdi.nextInt();

                    if (secim == 1) {
                        System.out.println("Yatırılacak Miktar: ");
                        int miktar = girdi.nextInt();
                        if (miktar > 0) {
                            bakiye += miktar;
                            System.out.println("Güncel miktar: " + bakiye);
                        } else {
                            System.out.println("Girilen miktar 0'dan büyük olmalı!");
                        }
                    }
                    if (secim == 2) {
                        System.out.println("Güncel bakiyeniz: " + bakiye + "\n" + "Çekmek istediğiniz miktarı giriniz: ");
                        int miktar = girdi.nextInt();
                        if (bakiye < miktar || miktar < 0) {
                            System.out.println("Yetersiz Bakiye");
                        } else {
                            bakiye -= miktar;
                            System.out.println("Güncel bakiyeniz: " + bakiye);
                        }
                    }
                    if (secim == 3) {
                        System.out.println("Güncel bakiyeniz: " + bakiye);
                    }
                } while (secim != 4);
                System.out.println("Bizi tercih ettiğiniz için teşekkürler...");
                break;


            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                girisHakki -= 1;
                System.out.println("Kalan hakkınız: " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("Hesabınız bloke edildi.");
                }
            }
        }


    }

    public static void atmProjesiSwitchCase() {
        Scanner girdi = new Scanner(System.in);
        String userName, password;
        int girisHakki = 3;
        int bakiye = 1500;
        int secim;

        while (girisHakki > 0) {
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName = girdi.nextLine();

            System.out.println("Şifrenizi giriniz: ");
            password = girdi.nextLine();

            if (userName.equals("Alpagu") && password.equals("123456")) {
                System.out.println("Giriş İşlemi Başarılı.\n" + "X Bankasına hoşgeldiniz.\n" + "Güncel Bakiyeniz:  " + bakiye);

                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: \n" + "1-Para Yatırma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula \n" + "4-Çıkış Yap");
                    secim = girdi.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.println("Yatırılacak Miktar: ");
                            int miktar = girdi.nextInt();
                            if (miktar > 0) {
                                bakiye += miktar;
                                System.out.println("Güncel miktar: " + bakiye);
                            } else {
                                System.out.println("Girilen miktar 0'dan büyük olmalı!");
                            }
                            break;
                        case 2:
                            System.out.println("Güncel bakiyeniz: " + bakiye + "\n" + "Çekmek istediğiniz miktarı giriniz: ");
                            int miktarCekme = girdi.nextInt();
                            if (bakiye < miktarCekme || miktarCekme < 0) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                bakiye -= miktarCekme;
                                System.out.println("Güncel bakiyeniz: " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Bizi tercih ettiğiniz için teşekkürler...");
                            break;
                        default:
                            System.out.println("Yanlış veya varolmayan işlem tercihi.");
                            break;
                    }

                } while (secim != 4);


                break;


            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre.");
                girisHakki -= 1;
                System.out.println("Kalan hakkınız: " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("Hesabınız bloke edildi.");
                }
            }
        }


    }

    public static void ebobVeEkokBulanProg() {
        Scanner girdi = new Scanner(System.in);

        int n1, n2, ebob = 1;
        System.out.println("N1: ");
        n1 = girdi.nextInt();
        System.out.println("N2: ");
        n2 = girdi.nextInt();


        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
        }

        System.out.println("***************************** ");
        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println(ebob);
                break;
            }

        }


    }

    public static void ebobWhile() {
        Scanner girdi = new Scanner(System.in);
        int n1, n2, k;
        n1 = girdi.nextInt();
        n2 = girdi.nextInt();
        int ebob = 1, ekok = 1;

        k = n1;
        while (k > 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                ekok = (n1 * n2) / ebob;
                break;
            }
            k--;
        }
        System.out.println("Ebob : " + ebob + "\nEkok : " + ekok);

    }

    public static void minVeMax() {
        Scanner girdi = new Scanner(System.in);
        int total, geciciMax = 0, geciciMin = 999999999;
        System.out.print("Toplam kaç adet sayı gireceksiniz ? : ");
        total = girdi.nextInt();

        for (int i = 0; i < total; i++) {
            System.out.println("Sayı: ");
            int girilenSayi = girdi.nextInt();
            if (girilenSayi >= geciciMax) {
                geciciMax = girilenSayi;
            }
            if (girilenSayi <= geciciMin) {
                geciciMin = girilenSayi;
            }
        }
        System.out.println("Max: " + geciciMax);
        System.out.println("Min: " + geciciMin);
    }

    public static void perfectNumber() {
        Scanner girdi = new Scanner(System.in);

        int a = girdi.nextInt();
        int toplam = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                toplam += i;
            }
        }

        if (toplam == a) {
            System.out.println(a + " Mükemmel sayıdır.");
        } else {
            System.out.println(a + " Mükemmel sayı değildir.");
        }
    }

    public static void tersUcgen() {
        Scanner girdi = new Scanner(System.in);
        int a = girdi.nextInt();

        for (int i = 0; i < a; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int l = 0; l < 2 * (a - i) - 1; l++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }

    public static void asalBulma() {
        Scanner girdi = new Scanner(System.in);
        int input = girdi.nextInt();
        int sayac = 0;

        for (int i = 2; i < input; i++) {
            for (int j = 2; j < input; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }

            if (sayac < 2) {
                System.out.print(i + ",");

            }
            sayac = 0;
        }


    }

    public static void fibonacciSerisi() {
        Scanner girdi = new Scanner(System.in);
        int length = girdi.nextInt();
        int n1 = 0, n2 = 1, temp;

        for (int i = 0; i < length; i++) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            System.out.println(temp);
        }
    }

    public static void hackerrankJavaLoopsII() {

        ////!!!
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += b * Math.pow(2, j);
                System.out.print(sum + " ");
            }
            System.out.println();
        }

    }

    public static int usAlma(int base, int exp) {
        int result = 1;

        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static void print() {
        System.out.println("Parametresiz olan metot.");
    }

    static int print(int a) {
        System.out.println("Parametreli metot.");
        return a;
    }

    static int print(int a, int b) {
        return a + b;
    }

    static int print(int a, int b, int c) {
        return a + b + c;
    }

    static int f(int x) {

        //f(1) = 1;
        //
        //f(2) = f(1) + 2;
        //
        //f(3) = f(2) + 3;
        //
        //f(4) = f(3) + 4;
        //
        //..........
        //
        //..........
        //
        //f(n) = f(n-1) + n;

        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    static int fRec(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        }
        return fRec(n - 1) * n;
    }

    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            System.out.println("Sayı => " + temp);
            lastNumber = temp % 10; // giren sayının son basamağını elde ettiğimiz işlem
            System.out.println("Son basamak => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber; // sürekli sağa kaydırma, sola kaydırmak isteseydik 10'a bölmeliydik
            System.out.println("Yeni sayı => " + reverseNumber);
            temp /= 10;
            System.out.println("=============");
        }
        if (reverseNumber == number) {
            return true;
        } else {
            return false;
        }

    }

    static int recFib(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return recFib(number - 1) + recFib(number - 2);
    }

    public static int isPrime(int num, int i) {
        //public static void main(String[] args) {
        //
        //        int num, prime;
        //        Scanner scanner = new Scanner(System.in);
        //        System.out.print("Pozitif bir sayi giriniz : ");
        //        num = scanner.nextInt();
        //
        //        prime = isPrime(num, num / 2);
        //
        //        if (prime == 1) {
        //            System.out.println(num + " sayisi asaldir");
        //        } else {
        //            System.out.println(num + " sayisi asal değildir");
        //        }
        //
        //    }

        if (i == 1) {
            return 1;
        } else {
            if (num % i == 0) {
                return 0;
            } else return isPrime(num, i - 1);
        }
    }

    static int recPower(int taban, int us) {
        if (us == 0 || taban == 1) {
            return 1;
        } else {
            return taban * recPower(taban, us - 1);
        }
    }



}













