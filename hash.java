import java.util.*;
class stu{
    int id;
    String name;
    String dep;
    stu(int id,String name,String dep){
        this.id=id;
        this.name=name;
        this.dep=dep;
    }
    void display(){
        System.out.println("id   :"+id);
        System.out.println("name :"+name);
        System.out.println("dep  :"+dep);
    }
}
public class hash{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<stu> s=new ArrayList<>();
        s.add(new stu(101,"ram","cse"));
        s.add(new stu(102,"yuvaraj","eee"));
        s.add(new stu(103,"siva","IT"));
        for(stu st:s){
            st.display();
        }
        HashMap<Integer,stu> h1=new HashMap<>();
        h1.put(101,new stu(101,"ram","cse"));
        h1.put(102,new stu(102,"yuvaraj","eee"));
        h1.put(101,new stu(103,"siva","it"));
        System.out.println("enter remove id");
        int remove=sc.nextInt();
        if(!h1.containsKey(remove)){
            System.out.println("invalid id ");
        }
        else{
            System.out.println("remove successfully");
            h1.remove(remove);
        }
        
    }
}