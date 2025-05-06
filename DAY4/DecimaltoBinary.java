package DAY4;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        DecimaltoBinary();
            }
        
            public static void DecimaltoBinary() {
                Scanner sc =new Scanner(System.in);
                System.out.println("enter a number here");
                int number=sc.nextInt();
                int sum=0;
                int mul=1;
                while(number>0){
                    int rem=number%10;
                    sum=sum+rem*mul;
                    mul=mul*2;
                    number=number/10;
                }
                System.out.println(sum);
            }
    
}
