package OOPS;

import java.util.HashMap;
import java.util.Scanner;

public class StudentManagementSystem {
    int Student_ID;
    String name;
    int age;
    char grade;
    double percentage;
    HashMap<String ,Integer> marks =new HashMap<>();
    void accept(){
        Scanner sc =new Scanner(System.in);
//        System.out.println("enter the student id :");
//         Student_ID = sc.nextInt();
        // sc.nextInt();  // consume newline

        System.out.println("Enter the name:");
        name =sc.nextLine();

        System.out.println("enter your age:");
        age =sc.nextInt();

        System.out.println("enter your grade:");
        grade =sc.next().charAt(0);

        System.out.println("Enter your marks for each subject:");
        System.out.println("Maths");
        marks.put("Maths", sc.nextInt());
        System.out.println("Physics");
        marks.put("physics" , sc.nextInt());
        System.out.println("chemistry");
        marks.put("chemistry" , sc.nextInt());
        System.out.println("hindi");
        marks.put("hindi" , sc.nextInt());
        System.out.println("English");
        marks.put("english" , sc.nextInt());
    }
    void calculatePercentage(){
        int totalMark =0;
        for(int mark : marks.values()){
            totalMark += mark;
        }
        percentage =(double) totalMark /marks.size();

    }
    void displayStudentDetails(){
        System.out.println("student _ID: ");
        System.out.println(" Name of the student : " + name);
        System.out.println("age of student : " + age);
        System.out.println("Grande " + grade);
        System.out.println(marks);
        System.out.println(" Percentage: " + percentage+ "%");
    }


    public static void main(String[] args) {
        StudentManagementSystem obj =new StudentManagementSystem();
        obj.accept();
        obj.calculatePercentage();
        obj.displayStudentDetails();

    }
}

