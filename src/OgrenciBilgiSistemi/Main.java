package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Namık hoca", "905000000", "TRH");

        Teacher t2 = new Teacher("Graham", "645545", "FZK");

        Teacher t3 = new Teacher("Külyutmaz", "456445", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");

        Course fizik = new Course("Fizik", "102", "FZK");

        Course biyo = new Course("Biyoloji", "101", "BIO");
        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);


        Student s1 = new Student("Hasan", "4.", tarih, fizik, biyo, "150");

        s1.addBulkExamNote(100, 55, 55);
        s1.isPass();

        Student s2 = new Student("Akgün" , "5",tarih,fizik,biyo,"321");

        s2.addBulkExamNote(75,87,20);
        s2.isPass();
    }
}
