package DAY5;

public class student {
    int id;
    String name;


    public student(int id,String name){
         this.id=id;
         this.name=name;
        }    
}

 class studentclass{
    public static void main(String[] args) {
        student s1= new student(1, "vaidik");
        System.out.println(s1.name);
        System.out.println(s1.id);


        
    }

}
