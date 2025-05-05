package DAY3;

import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        System.out.println("enter a number here");
        Scanner sc =new Scanner(System.in);
        int count=0;
        int number=sc.nextInt();

        while (number>0) {
            count++;
            number=number/10;

            
        }
        System.out.println(count);
        
    }
}