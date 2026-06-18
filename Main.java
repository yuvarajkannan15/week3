import java.util.Scanner;
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}
class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) throws InvalidSalaryException {
        this.name = name;
        this.id = id;
        setSalary(salary);
    }
    public void setSalary(double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Invalid salary! Salary must be greater than 0.");
        }
        this.salary = salary;
    }
  
    public void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();            
            Employee emp = new Employee(name, id, salary);
            emp.displayDetails();
        } catch (InvalidSalaryException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        sc.close();
    }
}
