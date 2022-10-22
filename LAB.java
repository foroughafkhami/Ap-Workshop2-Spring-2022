public class LAB {
    private Student[] students;
    private String teacherName;
//    the day in which the lab is held
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    public LAB(String teacherName, String dayOfWeek, int maxSize){
        this.teacherName = teacherName;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;
//        create an array of students with the size of "maxSize"
        students = new Student[maxSize];
    }

    //    get and return  students
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }

//    get and return dayOfWeek
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    public void setDayOfWeek(String DayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

//      get and return teacherName
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

//      get and return maxSize
    public int getMaxSize() {
        return maxSize;
    }
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

//       get and return currentSize
    public int getCurrentSize() {
        return currentSize;
    }
    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

//          get and return avgGrade
    public double getAvgGrade() {
        return avgGrade;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public void calAvg(){
        double sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum += students[i].getGrade();
        }
        avgGrade = sum/currentSize;
    }
    public void enrollStudent(Student students) {
        if (currentSize < maxSize) {
            this.students[currentSize] = students;
            currentSize++;
        }
        else {
            System.out.println("Lab is full.");
        }
    }

    public void printLabInfo() {
        for (int i = 0; i <currentSize; i++) {
            System.out.println("student firstname: " + students[i].getFirstName()
                    +" student lastname: " + students[i].getLastName()
                    + " std id: " + students[i].getId()
                    + " std grade: "+ students[i].getGrade());
        }
        System.out.println("Lab AVG: " + avgGrade);
    }




}
