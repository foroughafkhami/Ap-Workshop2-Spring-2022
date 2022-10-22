public class Main {
    public static void main(String [] args){
        Student std1 =new Student("James","Gosling", "0987654");
        Student std2 =new Student("Dennis", "Ritchie", "1234567");
        std1.setGrade(18);
        std2.setGrade(17.5);

        std1.printStudentInfo();
        System.out.println("----");
        std2.printStudentInfo();
        System.out.println("----");
        LAB lab1 = new LAB("Mr.Smith", "Monday", 30);
        lab1.enrollStudent(std1);
        lab1.enrollStudent(std2);
        lab1.calAvg();
        lab1.printLabInfo();

        LAB lab2 = new LAB("Mr.James", "Sunday", 40);
        College col1 = new College(100 , 12);
        System.out.println("---");
        System.out.println("Col1");
        col1.enrollLabs(lab1);
        col1.enrollLabs(lab2);
        col1.printCollegeInfo();
        col1.printnumOfLabs();
    }
}
