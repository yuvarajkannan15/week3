import java.util.*;
public class wrap {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(95);
        a.add(100);
        a.add(99);
        a.add(97);
        a.add(99);
        System.out.println("student marks : "+a);
        int total=0;
        for(Integer i:a){
            total+=i;
        }
        double avg=(double)total/a.size();
        System.out.println("total         : "+total);
        System.out.println("average       : "+avg);
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(Integer i:a){
           max.add(i);
           min.add(i);
        }
       System.out.println("max mark      : "+max.poll() +"\n" +"min mark      : "+min.poll());

    }
}
