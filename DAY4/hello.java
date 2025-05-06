package DAY4;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        BinarytTodecimal();
    }

    public static void BinarytTodecimal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  number here");
        int number=sc.nextInt();
        
        int sum=0;
        int mul=1;
        while (number>0) {
            int rem=number%2;
            sum=sum+rem*mul;
            mul=mul*10;
            number=number/2;
            
        }

        System.out.println(sum);

    }
    
}
