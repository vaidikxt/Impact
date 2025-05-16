package DAY8;

import java.util.Scanner;

import DAY7.traget;

public class login {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter your mail-id");
        String mailorgin= scanner.nextLine();

        String storedemail="abc@gmail.com";

        ismatch(mailorgin,storedemail);        
                scanner.close();
            }
        
            public static void ismatch(String mailorgin, String storedemail) {
             if(mailorgin.equals(storedemail)) {
                 System.out.println("Emails match!");
             }
             else if (!mailorgin.equals(storedemail)) {
                try {
                    mailorgin.toLowerCase();
                    if (mailorgin.equals(storedemail)) {
                        System.out.println("Emails match!");
                    }
                } catch (Exception e) {
                    System.err.println(e);   
                }
                
             }{

             }
            }
    
}
