package BoksMaci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;

    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage = damage;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter foe) {

        System.out.println(this.name + " => " + foe.name + "'a " + this.damage + " Hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println("Saldırı bloklandı.");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;

    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;

    }


}
