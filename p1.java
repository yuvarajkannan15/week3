import java.util.*;

public class p1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <String> stu=new ArrayList<>();
        System.out.println("add name count");
        int n=sc.nextInt();
        sc.nextLine();
        int i=1;
        while(i<=n){
            System.out.println("enter name "+i);
            String str=sc.nextLine();
            stu.add(str);
            i++;
        }
       
            System.out.println(stu);
       
    }
}