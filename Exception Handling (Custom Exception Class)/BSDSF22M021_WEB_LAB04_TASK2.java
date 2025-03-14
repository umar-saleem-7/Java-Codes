import java.util.*;

class InvalidMarksException extends Exception{

    public String toString(){
        return "Invalid Marks! Marks must be between 0-100.";
    }
}

class Student{
    
    private String name;
    private int marks;

    Student (String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public String assignGrade(int marks) throws InvalidMarksException{
        String grade;
        if (marks < 0 || marks > 100){
            throw new InvalidMarksException();
        } else if (marks >= 85){
            grade = "A";
        } else if (marks >= 70){
            grade = "B";
        } else if (marks >= 50){
            grade = "C";
        } else{
            grade = "F";
        }
        return grade;
    }
}

public class BSDSF22M021_WEB_LAB04_TASK2{
    public static void main(String[] args){
        try{
            String name;
            int marks;

            Scanner in = new Scanner(System.in);

            Student student;

            System.out.print("Enter name of the Student: ");
            name = in.nextLine();

            System.out.print("Enter marks of the Student: ");
            marks = in.nextInt();
            in.nextLine();

            student = new Student(name, marks);
            String grade = student.assignGrade(marks);

            System.out.println("Your Grade is: " + grade);
        } catch (InvalidMarksException e){
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Grade Assigned Successfully:)");
        }
    }
}