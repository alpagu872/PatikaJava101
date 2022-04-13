package Diziler;

import java.util.Arrays;

public class ArraysSinifi {

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7};


        int[] list2 = {2,6,5,8,54,6,8,9,456,54,6};

        double[] list3 = {1.1,4.6,7.5,2.6};
        Arrays.fill(list,2,7,10);

        int[] list4 = {5,6,564,646,84,7,8,78978,5460};
        Arrays.sort(list4);
       // System.out.println(Arrays.toString(list4));

        System.out.println(HelperArray.search(list4,646));



    }

}
