package DAY3;

import java.util.Scanner;

public class reverse {
 public static void main(String[] args) {
    System.out.println("enter a number here");
    int reversednumber=0;
    Scanner scanner= new Scanner(System.in);
    int number= scanner.nextInt();

    while (number>0) {
        int reminder=number%10;
        // here we are assigning revevrsed with *10 so it will move to next point 
        reversednumber=(reversednumber*10)+reminder;
        number=number/10;
    }
    System.out.println(reversednumber);

 }  
 
  
}
