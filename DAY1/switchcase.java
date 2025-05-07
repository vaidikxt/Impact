import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        newSwitch();
            }
        
            private static void noofdays() {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter The no of day to print here");
                int num=sc.nextInt();

                switch(num){
                    case 1 :
                    System.out.println("Monday");
                    break;
                    case 2 :
                    System.out.println("Tuesday");
                    break;
                    case 3 :
                    System.out.println("Wednesday");
                    break;
                    case 4 :
                    System.out.println("Thusday");
                    break;
                    case 5 :
                    System.out.println("Friday");
                    break;
                    case 6 :
                    System.out.println("Saturday");
                    break;
                    case 7 :
                    System.out.println("Sunday");
                    break;

                    default:
                    System.out.println("enter a vaild number here");
                    break;
                }
            }


            public static void newSwitch(){
                int days=11;
                days=days%7;
                switch(days){
                    case 1->
                    System.out.println("Monday");
                    case 2->
                    System.out.println("Tuesday");
                    case 3->
                    System.out.println("Wednesday");
                    case 4->
                    System.out.println("Thursday");
                    case 5->
                    System.out.println("Friday");
                    case 6->
                    System.out.println("Saturday");
                    case 7->
                    System.out.println("Sunday");
                    default->
                    System.out.println("enter a vaild number here");
                }
            }


}
