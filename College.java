public class College {
    private LAB[] labs;
    private int maxNumOfLabs;
    private int numClass;
    private int timeStartOfLab;
    private int numFullLabs;

    public College(int maxNumOfLabs, int timeStartOfLab) {
        this.timeStartOfLab = timeStartOfLab;
        this.maxNumOfLabs = maxNumOfLabs;
//        create an array of lab with the size of "maxNumOfLabs"
        labs = new LAB[maxNumOfLabs];
    }

    //    get and return maxNumOfLabs
    public int getMaxNumOfLabs() {
        return maxNumOfLabs;
    }

    public void setMaxNumOfLabs(int maxNumOfLabs) {
        this.maxNumOfLabs = maxNumOfLabs;
    }


    //    get and return numClass
    public int getNumClass() {
        return numClass;
    }

    public void setNumClass(int numClass) {
        this.numClass = numClass;
    }


    //    get and return numClass
    public int getTimeStartOfLab() {
        return timeStartOfLab;
    }

    public void setTimeStartOfLab(int timeStartOfLab) {
        this.timeStartOfLab = timeStartOfLab;
    }

    //    get and return numClass
    public int getNumFullLabs() {
        return numFullLabs;
    }

    public void setNumFullLabs(int numFullLabs) {
        this.numFullLabs = numFullLabs;
    }

    public void enrollLabs(LAB labs) {
        if (numFullLabs < maxNumOfLabs) {
            this.labs[numFullLabs] = labs;
            numFullLabs++;
        } else {
            System.out.println("number of Labs in college are full full.");
        }
    }

    public void printCollegeInfo() {
        for (int i = 0; i < numFullLabs; i++) {
            System.out.println("teachers name: " + labs[i].getTeacherName()
                    + " day of the lab: " + labs[i].getDayOfWeek());
        }
    }

    public void printnumOfLabs() {
        System.out.println("num of labs that are full: " + numFullLabs);
    }

}
