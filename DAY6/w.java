package DAY6;

public class w {
    public static void main(String[] args) {
    //     int sum =0;
    //     int arrray[]={13,4,3,25,12};

    //     for(int i=4; i>=0;i--){
    //         System.out.println(arrray[i]);
    //     }

    //     System.out.println();
    //     System.out.println();


    //     for(int i=0; i<arrray.length;i++){
    //         System.out.println(arrray[i]);
    //         sum+=arrray[i];
    //     }
    //     System.out.println(sum);
        
    // }

    int max=0;
    int arrray[]={1,2,4,5,6};
    int min=arrray[4];


    for(int i=0;i<arrray.length;i++){
        if(arrray[i]<min){
            min=arrray[i];
        }
        if(min<arrray[i]){
             max=arrray[i];
        }

    }

    System.out.println(max);
    System.out.println(min);


    }
    
}
