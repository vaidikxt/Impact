public class reverse {
    public static void main(String[] args) {
        reversearray();
            }
        
            public static void reversearray() {
               int array1[]={10,20,40};
               int array2[]= new int[array1.length];


               for(int i=0;i<array1.length;i++){
                array2[i] =array1[i];
            }

            for(int j:array2){
                System.out.println("elements at secound array "+j);
            }
            
            }
}
