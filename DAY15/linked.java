package DAY15;



 class Node {
    int data;
    Node nextpart;


    Node(int data){
        this.data=data;
    }
}
public class linked {
    public static void main(String[] args) {
        Node n1= new Node(10);
        Node n2=new Node(20);
        Node n3= new Node(30);



        n1.nextpart=n2;
        n2.nextpart=n3;
        n3.nextpart=null;
        Node currentpointer=n1;


        while (currentpointer!=null) {
            System.out.println(currentpointer.data);
            currentpointer=currentpointer.nextpart;
        }
        
    }
    
}
