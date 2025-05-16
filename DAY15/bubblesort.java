package DAY15;

public class bubblesort {
    public static void main(String[] args) {
        int array[]={3,4,12,33,1};

        bubblesort(array);

        for (int i : array) {
            System.out.print(i+" ");
        }
    }


    public static void bubblesort(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if (array[j]>array[j+1]&&array.length!=0) {
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
               
            }
        }
    }
}
