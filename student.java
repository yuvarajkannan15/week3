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
        System.out.println("id :"+id);
        System.out.println("name :"+name);
        System.out.println("dep :"+dep);
        System.out.println("----------------");
    }

}
 public class student{
    public static void main(String[] args) {
       ArrayList<stu> s=new ArrayList<>();
       s.add(new stu(101,"yuvaraj","cse"));
       s.add(new stu(102,"ravi","eee"));
       s.add(new stu(103,"ram","IT"));
       for(stu st:s){
          st.display();
       }
    }
}
