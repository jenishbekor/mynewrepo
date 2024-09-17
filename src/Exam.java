public class Exam {

    public String course;
    private int grade;

    // Setter method
    public void setGrade(int grade){
        if(grade>=0 && grade<=100)
            this.grade = grade;
    }

    //Getter Method
    public int getGrade(){
        return this.grade;
    }
}
