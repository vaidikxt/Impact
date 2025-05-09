package DAY7;

public class even {

    public static void main(String[] args) {
        int evencount=0;
        int oddcount=0;
        int array[]={1,23,6,2,34,5,8,12};
        for(int i:array){
            if(i%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("evencount "+ evencount+"\n"+"odd count "+oddcount);
       
    }
    
}
