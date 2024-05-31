import entities.Person;
import entities.Student;
import entities.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();
        do{
            System.out.println();
            System.out.println("Welcome to the system");
            System.out.println("Menu");
            System.out.println("1. Create a Student");
            System.out.println("2. Create a Teacher");
            System.out.println("3. Print Student(s)");
            System.out.println("4. Print Teacher(s)");
            System.out.println("5. Exit");
            System.out.println("Enter a option");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    System.out.println();
                    System.out.println("Student Creation");
                    System.out.println("Enter student name");
                    String nameStudent = scanner.next();
                    System.out.println("Enter student lastname");
                    String lastNameStudent = scanner.next();
                    System.out.println("Enter student age");
                    int ageStudent = scanner.nextInt();
                    System.out.println("Enter the student's semester number");
                    int noOfSemester = scanner.nextInt();
                    System.out.println("Enter the student's code ");
                    String studentCode = scanner.next();

                    Student student1 = new Student(nameStudent, lastNameStudent, ageStudent, noOfSemester, studentCode);
                    studentList.add(student1);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Teacher Creation");
                    System.out.println("Enter teacher name");
                    String nameTeacher = scanner.next();
                    System.out.println("Enter teacher lastname");
                    String lastNameTeacher = scanner.next();
                    System.out.println("Enter teacher age");
                    int ageTeacher = scanner.nextInt();
                    System.out.println("Enter the teacher's experience years");
                    int yearOfExperience = scanner.nextInt();
                    System.out.println("Enter the teacher's code");
                    String teacherCode = scanner.next();

                    Teacher teacher1 = new Teacher(nameTeacher, lastNameTeacher, ageTeacher, yearOfExperience, teacherCode);
                    teacherList.add(teacher1);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Summary of student admitted");
                    for(Student student: studentList){
                        student.printStudentProperties();
                    }
                case 4:
                    System.out.println();
                    System.out.println("Summary of teacher admitted");
                    for(Teacher teacher: teacherList){
                        teacher.printTeacherProperties();
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    break;

            }
        }while (option !=5);
    }
}
