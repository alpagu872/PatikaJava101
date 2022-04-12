package BoksMaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int startChance;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight,int startChance) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.startChance = startChance;

    }

    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println(" ==== YENİ ROUND ====");

                if (startChance()) {
                    this.f2.health = this.f1.hit(f2);
                } else {
                    this.f1.health = this.f2.hit(f1);

                }
                if (isWin()) {
                    break;
                }


                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık : " + this.f2.health);
            }

        } else {
            System.out.println("Sporcuların sikletleri uyumsuz.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " Kazandı");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(f1.name + " Kazandı ");
            return true;
        }
        return false;
    }

    boolean startChance() {
        double randomNumber2 = Math.random() * 100;
        return randomNumber2 <= this.startChance;
    }


}
