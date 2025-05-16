package DAY14;

public class singlylist {
    public static void main(String[] args) {
        Node fNode= new Node(10);
        Node sNode= new Node(20);
        Node tNode= new Node(30);
        Node forthNode=new Node(40);
        fNode.nexNode=sNode;
        sNode.nexNode=tNode;
        tNode.nexNode=forthNode;
        forthNode.nexNode=null;

        Node pointer=fNode;

        while (pointer!=null) {
            System.out.println(pointer.data);
            pointer=pointer.nexNode;            
        }
    }

    
}


 class Node {
    int data;
    Node nexNode;


    Node(int data){
        this.data=data;
    }

}