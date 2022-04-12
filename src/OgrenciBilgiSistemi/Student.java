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

    void addBulkExamNote(int note1, int sozlu1, int note2, int sozlu2, int note3, int sozlu3) {
        if (note1 >= 0 && note1 <= 100) {
            course1.note = note1;
            course1.sozlu = sozlu1;
        }
        if (note2 >= 0 && note2 <= 100) {
            course2.note = note2;
            course2.sozlu = sozlu2;
        }
        if (note3 >= 0 && note3 <= 100) {
            course3.note = note3;
            course3.sozlu = sozlu3;
        }

    }

    void isPass() {
        this.average = (((this.course1.note*0.8)+(this.course1.sozlu*0.2)) + (this.course2.note*0.8)+(this.course2.sozlu*0.2) + (this.course3.note*0.8)+(this.course3.sozlu*0.2)) / 3.0f;
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
