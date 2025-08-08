package Merge;



class Node{
    int Data;
    Node Next;
    public Node(int value){
        this.Data=value;
    }
}

public class MergeLL {
   Node head=null;
   Node tail=null;
   public void insertone(int value){
    Node node=new Node(value);
    if(head==null){
        head=tail=node;

    }else{
        tail.Next=node;
        tail=node;
    }
   } 
   public String toString(){
    StringBuilder strnode=new StringBuilder();
    Node current=head;
    while(current!=null){
        
        strnode.append(current.Data);
        if(current.Next!=null){
            strnode.append("->");
        }
        current=current.Next;
    }
    return strnode.toString();
   }
   public MergeLL mergeTwoll( MergeLL mll,MergeLL ml2){
    MergeLL llist=new MergeLL();
    //LinkedList<Integer> merg=new LinkedList<>(); can i use this to store values
    Node mllcurrent=mll.head;
    Node ml2current=ml2.head;
    while (mllcurrent!=null && ml2current!=null) {
        if(mllcurrent.Data < ml2current.Data){
            llist.insertone(mllcurrent.Data);
            mllcurrent=mllcurrent.Next;
        }else{
            llist.insertone(ml2current.Data);
            ml2current=ml2current.Next;
        }

    }
    while (ml2current!=null) {
        llist.insertone(ml2current.Data);
        
        ml2current=ml2current.Next;
    }
    return llist;
   }
}
