
public class exception{
    public static void main(String[] args) {
        try{
        int sal=Integer.parseInt("123");
        int arr[]=new int[3];
        System.out.println(arr[6]);
       }
       catch(NumberFormatException e){
        System.out.println("invalid salary format");
       }
       catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid array index");
       }
       finally{
        System.out.println("finally block executed");
       }
    }
}