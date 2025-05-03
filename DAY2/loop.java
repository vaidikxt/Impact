package DAY2;

public class loop {
    public static void main(String[] args) {
        int a=12;
        
        for(int i =0;i<=a;i++){
            System.out.println(i);
            a--;

        }
        do{
            System.out.println("ho rahaaaa");
        }
        while(a==12);


        while (a==12) {
            System.out.println("blah blah");
        }
        
        for(int i=0; i<=100;i++){
            System.out.println(i%2==0?i:"");
        }

    }
}
