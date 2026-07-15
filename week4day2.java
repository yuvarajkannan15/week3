
  
import java.util.ArrayList;

// public class week4day2 {
//     public static void main(String[] args) {
//         ArrayList<Integer> salaries=new ArrayList<>();
//         salaries.add(10000);
//         salaries.add(20000);
//         salaries.add(50000);
//         salaries.add(30000);
//         salaries.add(14000);
//         System.err.println("Salaries > 15000");
//         salaries.stream().filter( salary -> salary >15000).forEach(System.out::println);
          
//     }
// }
// public class week4day2{
//     public static void main(String[] args) {
//         ArrayList<Integer> a=new ArrayList<>();
//         a.add(100);
//         a.add(60);
//         a.add(79);
//         a.add(90);
//         a.add(98);
//         System.err.println("students marks above 85");
//         a.stream().filter(mark -> mark >85).forEach(System.out::println);
//     }
// }
// public class week4day2{
//     public static void main(String[] args) {
//         ArrayList<Integer> emp=new ArrayList<>();
//         emp.add(72);
//         emp.add(90);
//         emp.add(88);
//         emp.add(65);
//         emp.add(95);
//         emp.add(80);
//         emp.add(91);
//         emp.add(78);
//         emp.add(86);
//         emp.add(70);
//         emp.add(85);
//         emp.add(90);
//         emp.add(95);
//         System.err.println("employee performance avove 85");
//         emp.stream().filter(employee -> employee >85).forEach(System.out::println);

//     }
// }
// public class week4day2 {
//      public static void main(String[] args) {
//          ArrayList<Integer> salaries=new ArrayList<>();
//          salaries.add(10000);
//          salaries.add(20000);
//          salaries.add(50000);
//          salaries.add(30000);
//          salaries.add(14000);
//          System.err.println("Salaries > 15000");
//          salaries.stream().map( salary -> salary +5000).forEach(System.out::println);
          
//      }
//  }
// public class week4day2
// {
//      public static void main(String[] args) 
//      {
//          ArrayList<Integer> a=new ArrayList<>();
//          a.add(57);
//          a.add(60);
//          a.add(79);
//          a.add(81);
//          a.add(93);
//          List<Integer> count = a.stream().filter(mark -> mark >=80).collect(Collectors.toList());
//          System.out.println("eligibe employee");
//          count.forEach(System.out::println);
//      }
//  }
public class week4day2{
    public static void main(String args[]){
        ArrayList<Integer> salaries=new ArrayList<>();
          salaries.add(10000);
          salaries.add(20000);
          salaries.add(50000);
          salaries.add(30000);
          salaries.add(14000);
          salaries.forEach(System.out::println);
    }
}
