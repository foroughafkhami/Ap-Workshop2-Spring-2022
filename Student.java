public class Student {
    private String firstname;
    private String lastname;
    //    student id is a 7 digit number
    private String id;
    private double grade;

    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
//        assume that student grade is zero
        grade = 0;
    }

    //    get and return firstname of student
    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    //        get and return lastname of student
    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    //    get and return id of student
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() == 7)
            this.id = id;
    }

    //get and return grade of student
    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
//print information of students
    public void printStudentInfo() {
        System.out.println(firstname + " " + lastname + "\nID: " + id + "\nGRADE: " + grade);
    }

}