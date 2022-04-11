package OgrenciBilgiSistemi;

public class Student {
    String name;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    String stNo;
    double average;
    boolean isPass;

    Student(String name, String classes, Course course1, Course course2, Course course3, String stNo) {
        this.name = name;
        this.classes = classes;
        this.stNo = stNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            course1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            course2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            course3.note = note3;
        }

    }

    void isPass() {
        this.average = (this.course1.note + this.course2.note + this.course3.note) / 3.0f;
        if (this.average > 55) {
            System.out.println("Sınıfı başarıyla geçtiniz.");
            isPass = true;
        } else {
            System.out.println("Kaldınız.");
            isPass = false;
        }
        System.out.println();
        printNote();
    }

    void printNote() {
        System.out.println(this.course1.name + "  Notu : " + this.course1.note);
        System.out.println(this.course2.name + "  Notu : " + this.course2.note);
        System.out.println(this.course3.name + "  Notu : " + this.course3.note);
        System.out.println("Ortalamanız: " + this.average);
    }


}
