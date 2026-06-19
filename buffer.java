
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class buffer {
    public static void main(String[] args) {
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("attendance.txt"));

            for(int i=1;i<=20;i++){
                bw.write("emp_id : "+i);
                bw.newLine();
                bw.write("emp_name : employee "+i);
                bw.newLine();
                bw.write("emp_salary : "+(1000*1));
                bw.newLine();
                bw.write("-----------------------");
                bw.newLine();
            }
            bw.close();
          BufferedReader br=new BufferedReader(new FileReader("attendance.txt"));
          String str;
          while((str=br.readLine())!=null){
            System.out.println(str);
          }
          br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
}
