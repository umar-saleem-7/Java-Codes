import java.util.*;

class Employee{

    private String name;
    private String email;
    private double salary;
    private String company;

    public Employee(){
        name = "Umar Saleem";
        email = "bsdsf22m021@pucit.edu.pk";
        salary = 1000000.0;
        company = "IB-Tech";
    }

    public void diplayinfo(){
        System.out.println("Name: " + name);
        System.out.println("E-mail: " + email);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + company);
    }
}

public class Task4{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.diplayinfo();
    }
}