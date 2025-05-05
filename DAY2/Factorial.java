package DAY2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fac=1;
        System.out.println("enter num you wanna find");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fac*=i;
           
        }
        System.out.println("Factorial Of num is "+fac);
        sc.close();
    }
    
}
