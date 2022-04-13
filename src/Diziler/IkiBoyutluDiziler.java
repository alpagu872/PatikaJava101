package Diziler;

public class IkiBoyutluDiziler {
    public static void main(String[] args) {

        int[][] matris = new int[3][4];
        int number = 1;

        for (int i = 0; i < matris.length; i++) {

            // matris[i]
            // matris[0][1]
            for (int j = 0 ; j < matris[i].length; j++){
                matris[i][j] = number++;

            }

        }

        for (int k = 0 ; k < matris.length ; k++){
            for (int j = 0 ; j < matris.length+1     ; j++){
                System.out.print(matris[k][j]+ " ");
            }
            System.out.println();
        }


    }
}
