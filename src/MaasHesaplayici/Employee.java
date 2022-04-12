package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    double workHours;
    double hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0;
        if (this.salary > 1000) {
            tax = this.salary * 3 / 100;
            return tax;
        } else {
            return tax;
        }
    }

    double bonus() {

         int bonus = 0;
         int netHours = 0;

        if (workHours > 40) {
            netHours = (int) (this.workHours - 40);
            bonus += netHours * 30;
            return bonus;
        } else {
            return bonus;
        }
    }

    double raiseSalary() {
        double artis = 0;
        this.hireYear %= 4042;
        this.hireYear = 2021 - hireYear;
        if (this.hireYear < 10) {
            artis += this.salary * 0.05;
            return artis;
        } else if (hireYear >= 10 && hireYear < 20) {
            artis += this.salary * 0.1;
            return artis;
        } else if (hireYear > 19) {
            artis += this.salary * 0.15;
            return artis;
        }
        return artis;

    }
    double calc(){
        double netMaas =0 ;
        netMaas=this.salary + bonus()+raiseSalary()-tax();
        return netMaas;
    }

    void printInfo() {

        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : "+ this.salary);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi :" + tax());
        System.out.println("Bonus: "+ bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + calc());
        System.out.println("Toplam Maaş: " + (calc() + tax()));





    }

}
