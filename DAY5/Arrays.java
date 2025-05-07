package DAY5;

/*
 * memory allocation calculation 
 * =(base address)+index*4
 * so easily for  0 th index
 
 var in stack memory and other new objects are  in heap memory
 */
public class Arrays {

    public static void main(String[] args) {
        int arrray[]={1,3,4,5,6};
        int[]newNums= new int[10];
        System.out.println(newNums);

        char charArray[]= new char[10];
        charArray[0]='v';
        charArray[1]='a';
        charArray[2]='i';
        charArray[3]='d';
        charArray[4]='i';
        charArray[5]='k';


        for(char i:charArray){
            System.out.println(i);
        }


      


        
    }
}


