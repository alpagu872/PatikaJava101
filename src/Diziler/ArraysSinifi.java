package Diziler;

import java.util.Arrays;

public class ArraysSinifi {

    public static void main(String[] args) {

        //Arrays.toString()
        //Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.

        //Arrays.fill()
        //Arrays.fill metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.

        //Arrays.sort()
        //Arrays.sort() metodu ile dizilerdeki elemanları sıralayabiliriz.

        //Arrays.binarySearch()
        //Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir.
        // Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.

        //Arrays.copyOf() ve Arrays.copyOfRange() metotu
        //Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için Arrays.copyOf() metotu kullanılır
        //Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise Array.copyOfRange() metodu kullanılır.

        //Arrays.equals() metotu
        //Java'da iki dizinin eşitliğini kontrol etmek için Arrays.equals() metotu kullanılır.


        int[] list = {1, 2, 3, 4, 5, 6, 7};


        int[] list2 = {2, 6, 5, 8, 54, 6, 8, 9, 456, 54, 6};

        double[] list3 = {1.1, 4.6, 7.5, 2.6};
        Arrays.fill(list, 2, 7, 10);

        int[] list4 = {5, 6, 564, 646, 84, 7, 8, 78978, 5460};
        Arrays.sort(list4);
        // System.out.println(Arrays.toString(list4));

        //System.out.println(HelperArray.search(list4,646));

        Arrays.sort(list4);

        System.out.println(Arrays.binarySearch(list4, 8));

        int[] copyList = Arrays.copyOf(list4, 5);
        System.out.println(Arrays.toString(copyList));


    }

}
