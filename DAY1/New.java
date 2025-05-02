import java.util.Scanner;

public class New {
    public static void main(String[] args) {
     //  oddeven();
     voting();
    //    int a=12;
    //    System.out.println(a%2==0?"even":"odd");
    }

    // public static void oddeven(){
    //     System.out.println("enter a number here");
    //     int number=sc.nextInt();


    //     if(number==0){
    //         return ;
    //     }
        
    //     if(number%2==0){
    //         System.out.println("even");
    //     }

    //     else{
    //         System.out.println("odd");
    //     }
    // }

    public static void  voting(){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter yout age here");
        int age=sc.nextInt();
        System.out.println(age>18?"eligible":"not eligible");
    }
}