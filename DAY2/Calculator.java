package DAY2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number here");
        int num1=sc.nextInt();
        System.out.println("enter operator here");
        char operator=sc.next().charAt(0);
        System.out.println("enter secound num here");
        int num2=sc.nextInt();

        switch(operator){
            case '+':
            System.out.println(num1+num2);
            break;
            case'-':
            System.out.println(num1-num2);
            case'*':
            System.out.println(num1*num2);
            break;
            case'/':
            System.out.println(num1/num2);
            break;
            default:
            System.out.println("not valid sign");
        }
        sc.close();
    }
    
}
