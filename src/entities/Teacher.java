package entities;

public class Teacher extends Person {
    private int yearsOfExperience;
    private String teacherCode;

    public Teacher(){

    }
    public Teacher(String name, String lastName, int age){
        super(name, lastName, age);
    }
    public Teacher(String name, String lastName, int age, int yearsOfExperience, String teacherCode){
        super(name, lastName, age);
        this.yearsOfExperience = yearsOfExperience;
        this.teacherCode = teacherCode;
    }
    public void printTeacherProperties(){
        System.out.println("**** Print Teacher Properties ****");
        System.out.println("Name: " +name);
        System.out.println("LastName: " +lastName);
        System.out.println("Age: " +age);
        System.out.println("Years Of Experience: " +yearsOfExperience);
        System.out.println("Teacher Code: " +teacherCode);
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }
}
