package DAY7;

public class secoundelement {
    public static void main(String[] args) {
        secoundmax();
    }
            
        
            private static void secoundmax() {
               int max=Integer.MIN_VALUE;
               int secoundmax=Integer.MIN_VALUE;

               int array[]={10,2,3,45,3,12};


               for(int num:array){
                if(num>max){
                    secoundmax=max;
                    max=num;
                }
                else if(num>secoundmax && num!=max){
                    secoundmax=num;
                }
            }
            
        }
    }
