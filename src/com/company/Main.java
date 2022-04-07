package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        forDongusu();

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
        System.out.println("1-TOPLAMA \n" +
                "2-ÇIKARMA\n" +
                "3-ÇARPMA\n" +
                "4-BÖLME");
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

        System.out.println("1-TOPLAMA \n" +
                "2-ÇIKARMA\n" +
                "3-ÇARPMA\n" +
                "4-BÖLME");

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
            if (n2 != 0)
                System.out.println((float) n1 / n2);
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
            System.out.println("Başarıyla giriş yapıldı...\n" +
                    "Yönlendiriliyorsunuz...");

        } else if (!(password.equals("123")) && !(username.equals("Alpagu"))) {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış, tekrar deneyiniz.");
            kullaniciGirisi();
        } else if (!(password.equals("123"))) {
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");

            System.out.println("1-HAYIR\n" +
                    "2-EVET");
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
            System.out.println("Yeni şifreniz oluşturuldu.\n" +
                    "Giriş ekranına yönlendiriliyorsunuz....");
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

        System.out.println("1-TEK YÖN \n" +
                "2-GİDİŞ GELİŞ");

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
        }
        while (askPass);

        //
        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;

            }while(j<4);


            i++;
        }

    }

    public static void forDongusu(){
        for (int sayac = 1 ; sayac<= 10 ; sayac++){
            System.out.print(sayac +" ");
        }

        System.out.println();

        int k = 1;
        while (k <= 10){
            System.out.print(k + " ");
            k++;
        }



    }
}





