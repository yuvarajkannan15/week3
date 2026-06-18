class InvalidSalaryException extends Exception {
    InvalidSalaryException(String message) {
        super(message);
    }
}

// employeeSalary
public class EmployeeSalaryDemo {

    static void validateSalary(double salary) throws InvalidSalaryException {
        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than zero");
        }

        System.out.println("Valid Salary: " + salary);
    }

    public static void main(String[] args) {
        try {
            validateSalary(-5000);
        }
        catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}
