public class LinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
       this.data=data;
       this.next=null;
        }
    }
    Node head=null;
    public void Insertionbeg(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void InsertionEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    public void Insertionsp(int data,int pos){
        Node newNode=new Node(data);
        if(pos==1){
            head=newNode;
        }
        else{
            Node temp=head;
            int i=1;
            while(i<pos-1){
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    public void printArray(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
    }
    public void popf(){
        Node temp=head;
        head=temp.next;
        temp=null;
    }
    public void popl(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.Insertionbeg(10);
        l.Insertionbeg(20);
        l.Insertionbeg(30);
        l.InsertionEnd(40);
        l.Insertionsp(50, 3);
        l.popf();
        l.popl();
        l.printArray();
    }
}