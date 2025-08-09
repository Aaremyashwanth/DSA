package CircularLinkedlist;

class Node{
    int data;
    Node Next;
     Node(int value){
        this.data=value;
    }
}
public class Circular  {
   Node head=null;
   Node tail=null;
    public void circularLL(int value){
        Node node=new Node(value);
        if(head==null){
            head=tail=node;
            return;
        }else{
            tail.Next=node;
            node.Next=head;
            tail=node;
        }
        
    }
    
     public String toString(){
         if (head == null) {
            return "Empty List";
        }
        StringBuilder resultcc=new StringBuilder();
        Node current=head;
        if(head!=null){
            do {
             resultcc.append(current.data);
           if(current.Next!=head){
            resultcc.append("->");
           }
                current=current.Next;
            } while (current!=head);
        }
       
        return resultcc.toString();
    }
    public void deletevalue(int value){
        Node current =head;
        if(current.data==value){
            head=current.Next;
            tail.Next=head;
            return;}
            do {
                //current=current.Next;
                    Node c=current.Next;
                if (c.data==value) {
                  current.Next = c.Next;
                  //break;
                }
                current=current.Next;
            } while (current!=head );
    }

     public static void main(String[] args) {
        Circular cl=new Circular();
        cl.circularLL(2);
        cl.circularLL(5);
        cl.circularLL(7);
        cl.circularLL(15);
        System.out.println(cl);
        cl.deletevalue(7);
        System.out.println(cl);

     }
}
