package DAY7;

public class secoundmin {
    public static void main(String[] args) {
        int array[]={1,3,4,5,6,2};
        int min=Integer.MAX_VALUE;
        int secoundmin=Integer.MIN_VALUE;


        for(int num:array){
            if (num<min) {
                secoundmin=num;
            }
        }
        System.out.println(secoundmin);
        
    }
}
