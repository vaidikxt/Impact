package DAY8;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name here");
        String name=sc.nextLine();

       
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        sc.close();
    }
}
