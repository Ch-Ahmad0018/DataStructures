import java.util.Scanner;

class Stack{
   static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    Node top=null;
    public void push(int data){
        Node newNode=new Node(data);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }
    public void pop(){
        if (top==null){
            System.out.println("Underflow");
        }
        else{
            top=top.next;
            System.out.println("Item deleted");
        }
    }
    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }}
    class Stack_Linkedlist{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int data;
            Stack s=new Stack();
            int k=0;
            while(k!=4){
            System.out.println("Enter 1 to push 2 to pop 3 to display 4 to end");
             k=sc.nextInt();
            if (k==1){
             data=sc.nextInt();
             s.push(data);
            }
            else if (k==2){
                s.pop();
            }
            else if (k==3){
                s.display();
            }            
        }
        }
    }
