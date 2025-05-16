package DAY8;

import java.lang.reflect.Array;
import java.util.Arrays;

public class index {

    public static void main(String[] args) {

        int array[]={2,4,3,2,23};
        arraysort(array);
    }

    public static void  arraysort(int[] array){
        Arrays.sort(array);

        System.out.println("Sorted arrayy"+Arrays.toString(array));
        System.out.println("Secound largest element"+array[array.length-2]);
        System.out.println("seound lowest"+array[1]);

    }

    
}
