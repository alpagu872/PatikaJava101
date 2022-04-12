package BoksMaci;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Hasan" , 75,1000,90,0);
        Fighter f2 = new Fighter("Basak",75,1000,58,0);

        Match match = new Match(f1,f2,50,90,50);
        match.run();
        match.isWin();

    }
}
