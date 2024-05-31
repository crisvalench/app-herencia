package entities;

public class Student extends Person{
    private int noOfSemester;
    private String studentCode;


    public Student(){

    }

    public Student(String name, String lastName, int age){
        super(name, lastName, age);
    }

    public Student(String name, String lastName, int age, int noOfSemester, String studentCode){
        super(name, lastName, age);
        this.noOfSemester = noOfSemester;
        this.studentCode = studentCode;
    }

    public void printStudentProperties(){
        System.out.println("**** Print Student Properties ****");
        System.out.println("Name: " +name);
        System.out.println("LastName: " +lastName);
        System.out.println("Age: " +age);
        System.out.println("No of Semester: " +noOfSemester);
        System.out.println("Student Code: " +studentCode);
    }

    public int getNoOfSemester() {
        return noOfSemester;
    }

    public void setNoOfSemester(int noOfSemester) {
        this.noOfSemester = noOfSemester;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
