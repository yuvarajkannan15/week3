// interface greetings{
//     void hello();
// }
// class shello implements greetings{
//     public void hello(){
//    System.out.println("welcome students");}
// }
// public class week{
//      public static void main(String[] args) {
//          shello h=new shello();
//          h.hello();
//      }
// }

// interface greetings{
//     void hello();
// }
// public class lamda{
//     public static void main(String[] args) {
//         greetings obj = () -> System.err.println("welcome student");
//         obj.hello();
//     }
// }
// interface emp{
//     void sample();
// }
// public class week{
//     public static void main(String[] args) {
//         emp obj=() -> System.err.println("employee completed daily task");
//         obj.sample();
//     }
// }
// interface Add {
//     int add(int a, int b);
// }

// public class week {
//     public static void main(String[] args) {

//         Add obj = (x, y) -> x + y;
//         System.out.println("Sum : " + obj.add(10, 20));
//     }
// }

// interface sal{
//     double sal(int in,int al);
// }
// public class week{
//     public static void main(String[] args) {
//         sal s=(in,al) -> in+al;
//         System.err.println("income : "+s.sal(100000,20000));
//     }
// }

interface Notification {
    void sendMessage();
}

public class week {
    public static void main(String[] args) {

        Notification notification = () -> {
            System.out.println("notification sent successfully");
        }

        notification.sendMessage();
    }
}