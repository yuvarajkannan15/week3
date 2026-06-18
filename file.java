
import java.io.FileReader;
import java.io.FileWriter;

public class file {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("emp.txt");
            FileReader fr=new FileReader("emp.txt");
            fw.write("emp_id : 101\nemp_name : yuvaraj\nemp_salary : 20000");
            fw.close();
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
