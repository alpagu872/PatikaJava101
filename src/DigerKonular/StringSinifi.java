package DigerKonular;

public class StringSinifi {
    public static void main(String[] args) {
        String str = "patika";
        String patika = "paTİka";


        System.out.println(str.codePointAt(1));//UNICODE BULMA
        System.out.println(str.compareTo(patika));// kıyaslama, eğer aynılarsa 0 çıkmalı
        System.out.println(str.concat(".dev"));//stringe ekleme yapma
        System.out.println(str.contains("pat"));//kapsıyor mu diye bir sorucuk, eğer varsa true yoksa false döner
        System.out.println(str.endsWith("a"));//BİTİŞ KARAKTERİNİ SORGULAR, EĞER O KARAKTER İLE BİTİYORSA TRUE DÖNDÜRÜR.
        System.out.println(str.equals("patika"));//denklik kıyaslaması
        System.out.println(str.equalsIgnoreCase("pAtika"));//büyük vw küçüklük kıyaslamasını görmezden gelip karşılaştırma yapıyor.
        System.out.println(str.indexOf("k"));// eğer var ise girilen karakterin indexini geri döndürür. --Bulduğu ilk karakter---
        System.out.println(str.isEmpty());//Dizinin dolu mu boş mu olduğunu kontrol ediyor.
        System.out.println(str.lastIndexOf("a"));//sağdan ilk bulduğu aranan karakterin indexini verir.
        System.out.println(str.length());//String'in uzunluğunu verir.
        System.out.println(str.replace("a","b"));//seçilen karakterleri seçilen bir karakterle değiştirmeyi sağlıyor.
        System.out.println(str.replaceFirst("a","b"));// sadece ilk bulduğunu değiştirir.
//        System.out.println(str.split("a"));


    }
}
