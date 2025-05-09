package DAY7;

public class secoundelement {
    public static void main(String[] args) {
        int array[]={10,40,30,23,11};

        int min=0;
        int max=0;


        for(int result:array){
            if(result>max){
                max=result;
            }
            if (result<max) {
                min=result;
            }
        }

        System.out.println(max+"\n"+min);
    }
}
