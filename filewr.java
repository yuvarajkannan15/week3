
import java.io.FileWriter;

public class filewr {
    public static void main(String[] args) {
        try {
           FileWriter fw= new FileWriter("employee.txt");
           fw.write("emp_id : 101 \nemp_name : yuvaraj \nemp_salary : 15000");
           fw.close();
           System.out.println("date saved");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
