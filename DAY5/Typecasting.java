package DAY5;

public class Typecasting {
    public static void main(String[] args) {
        /*
         * implict type casting
         * converting values from lower datatype to higher datatype
         * byte → short → int → long → float → double
         * no dataloss
         */
        /*
         * explict
         * higher to lower datatype is explict
         */


         byte val=10;
         int val1=val;
         System.out.println(val1);



         int vl=124;
         byte vl1= (byte)vl;

         System.out.println(vl1);
    }
}
