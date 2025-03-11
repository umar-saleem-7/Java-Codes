import java.util.*;

abstract class Staff {
    String name;
    int id;
    String department;

    public Staff(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nDepartment: " + department;
    }

    abstract double calculateSalary();
}

class Professor extends Staff {
    double monthlySalary;

    public Professor(String name, int id, String department, double monthlySalary) {
        super(name, id, department);
        this.monthlySalary = monthlySalary;
    }

    public double calculateSalary() {
        return monthlySalary;
    }

    public String toString() {
        return super.toString() + "\nSalary: " + calculateSalary();
    }
}

class Lecturer extends Staff {
    int total_lectures;
    double payPerLecture;

    public Lecturer(String name, int id, String department, int total_lectures, double payPerLecture) {
        super(name, id, department);
        this.total_lectures = total_lectures;
        this.payPerLecture = payPerLecture;
    }

    double calculateSalary() {
        return total_lectures * payPerLecture;
    }

    public String toString() {
        return super.toString() + "\nSalary: " + calculateSalary();
    }
}

class Administrator extends Staff {
    double baseSalary, bonus;

    public Administrator(String name, int id, String department, double baseSalary, double bonus) {
        super(name, id, department);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    double calculateSalary() {
        return baseSalary + bonus;
    }

    public String toString() {
        return super.toString() + "\nSalary: " + calculateSalary();
    }
}

class ResearchAssistant extends Staff {
    double stipend, grant;

    public ResearchAssistant(String name, int id, String department, double stipend, double grant) {
        super(name, id, department);
        this.stipend = stipend;
        this.grant = grant;
    }

    double calculateSalary() {
        return stipend + grant;
    }

    public String toString() {
        return super.toString() + "\nSalary: " + calculateSalary();
    }
}

public class BSDSF22M021_WEB_Lab02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Staff[] staff = new Staff[4];
        System.out.println("University Payroll System: ");
        System.out.println("---------------------------------");

        System.out.println("For Professor: ");
        System.out.println("---------------------------------");
        System.out.print("Enter Name: ");
        String profname = in.nextLine();
        System.out.print("Enter ID: ");
        int profid = in.nextInt();
        in.nextLine(); 
        System.out.print("Enter Department: ");
        String profdept = in.nextLine();
        System.out.print("Enter Monthly Salary: ");
        double sal = in.nextDouble();
        in.nextLine();
        staff[0] = new Professor(profname, profid, profdept, sal);

        System.out.println("---------------------------------");
        System.out.println("For Lecturer: ");
        System.out.println("---------------------------------");
        System.out.print("Enter Name: ");
        String lecname = in.nextLine();
        System.out.print("Enter ID: ");
        int lecid = in.nextInt();
        in.nextLine();
        System.out.print("Enter Department: ");
        String lecdept = in.nextLine();
        System.out.print("Enter Lecturers Taken: ");
        int lecs = in.nextInt();
        System.out.print("Enter Pay Per Lecture: ");
        double payperlec = in.nextDouble();
        in.nextLine();
        staff[1] = new Lecturer(lecname, lecid, lecdept, lecs, payperlec);

        System.out.println("---------------------------------");
        System.out.println("For Administrator: ");
        System.out.println("---------------------------------");
        System.out.print("Enter Name: ");
        String adname = in.nextLine();
        System.out.print("Enter ID: ");
        int adid = in.nextInt();
        in.nextLine();
        System.out.print("Enter Department: ");
        String addept = in.nextLine();
        System.out.print("Enter Base Salary: ");
        double base_sal = in.nextDouble();
        System.out.print("Enter Bonus: ");
        double bonus = in.nextDouble();
        in.nextLine();
        staff[2] = new Administrator(adname, adid, addept, base_sal, bonus);

        System.out.println("---------------------------------");
        System.out.println("For Research Assistant: ");
        System.out.println("---------------------------------");
        System.out.print("Enter Name: ");
        String raname = in.nextLine();
        System.out.print("Enter ID: ");
        int raid = in.nextInt();
        in.nextLine();
        System.out.print("Enter Department: ");
        String radept = in.nextLine();
        System.out.print("Enter Stipend: ");
        double stip = in.nextDouble();
        System.out.print("Enter Research Grant: ");
        double researchgrant = in.nextDouble();
        in.nextLine();
        staff[3] = new ResearchAssistant(raname, raid, radept, stip, researchgrant);

        System.out.println("---------------------------------");
        System.out.println("Staff Details and their Salaries:");
        System.out.println("---------------------------------");

        for (int i = 0; i < staff.length; i++) {
			
			if (staff[i] instanceof Professor) {
				System.out.println("Professor: \n---------------------------------\n" + staff[i]);
			} 
			else if (staff[i] instanceof Lecturer) {
				System.out.println("Lecturer: \n---------------------------------\n" + staff[i]);
			}
			else if (staff[i] instanceof Administrator) {
				System.out.println("Administrator: \n---------------------------------\n" + staff[i]);
			}
			else if (staff[i] instanceof ResearchAssistant) {
				System.out.println("Research Assistant: \n---------------------------------\n" + staff[i]);
			}
		}

   
    }
}
