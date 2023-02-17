package PratikOBS;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    void addBlukVerbalNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100){
            mat.verbalGrade=note1;
        }
        if(note2>=0 && note2<=100){
            fizik.verbalGrade=note2;
        }
        if(note3>=0 && note3<=100){
            kimya.verbalGrade=note3;
        }
    }

    public void isPass() {
        this.avarage=((this.mat.note*(1-mat.gradePercentage)+this.mat.verbalGrade*mat.gradePercentage)+this.fizik.note*(1-fizik.gradePercentage)+this.fizik.verbalGrade*fizik.gradePercentage+this.kimya.note*(1-kimya.gradePercentage)+this.kimya.verbalGrade*kimya.gradePercentage)/3.0;
        if(this.avarage>55){
            System.out.println("Hababam uyanıyor");
        }else{
            System.out.println("Hababam sınıfta kaldı.");
        }

        printNote();
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}