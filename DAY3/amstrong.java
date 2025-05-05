package DAY3;

import java.util.Scanner;
import java.lang.Math;


public class amstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        amstrongnum(153);
        
    }
    



    public static void amstrongnum(int number){
        int count=0;
        int result = 0;

        while(number>0){
            count++;
            number=number/10;

        }
        while (number>0) {
            int reminder=number%10;
            result+=(int)Math.pow(reminder, count);
            number=number/10;
        }

        System.out.println(result==number?"amstrong"+number:"not amstrong");
    }
}