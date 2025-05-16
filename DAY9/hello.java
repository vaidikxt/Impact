package DAY9;

public class hello {

    public static void main(String[] args) {
        int array[]={1,3,2,43,12};
        int traget=12;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==traget){
                System.out.println("found it");
            }
        }
    }
}