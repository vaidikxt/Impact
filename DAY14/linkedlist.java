package DAY14;

import org.w3c.dom.Node;

public class linkedlist {

    public static void main(String[] args) {
        nodes nodess= new nodes(23);
        System.out.println("nodes are "+nodess.data);
        
    }
}

class nodes{
    
    int data;
    Node nextptr;

    nodes(int data){
        this.data=data;
    }
}