
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class buffer {
    public static void main(String[] args) {
        int count=50;
        Scanner sc=new Scanner(System.in);
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("attendance.txt"));
 
            for(int i=1;i<=20;i++){
                bw.write("stu_id   : "+i);
                bw.newLine();
                bw.write("stu_name : student"+i);
                bw.newLine();
                bw.write("stu_mark : "+(count+i));
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
