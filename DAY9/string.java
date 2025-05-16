package DAY9;

/*
 * we have to find prefix which is common in all 
 * like wise pattern is first base case is 
 * length for 1<str<200
 * no capslock 
 * ""
 */

public class string {

    public static void main(String[] args) {
     String []str={"flower","flow","flight"};
     String lowest=str[0];

    

     for(int i=0; i<str.length;i++){
        if(str[i].length()<lowest.length()){
            lowest=str[i];
        }
     }
     char [] array=lowest.toCharArray();

     String commonPrefix="";

     


    }
    
}