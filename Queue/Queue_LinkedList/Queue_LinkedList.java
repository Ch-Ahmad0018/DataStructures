import java.util.Scanner;

class Queue{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    Node f=null;
    Node r=null;
    public void Enqueue(int data){
        Node newNode=new Node(data);
        if (f==null&&r==null){
            f=newNode;
            r=newNode;
        }
        else{
            r.next=newNode;
            r=newNode;
        }
    }
    public void Dequeue(){
        if (f==null&&r==null){
            System.out.println("Underflow");
        }
        else{
            f=f.next;
        }
    }
    public void display(){
        Node temp=f;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}
class Queue_LinkedList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data;
        Queue s=new Queue();
        int k=0;
        while(k!=4){
        System.out.println("Enter 1 to push 2 to pop 3 to display 4 to end");
         k=sc.nextInt();
        if (k==1){
         System.out.println("Enter data");
         data=sc.nextInt();
         s.Enqueue(data);
        }
        else if (k==2){
            s.Dequeue();
        }
        else if (k==3){
            s.display();
        }
    }
}}