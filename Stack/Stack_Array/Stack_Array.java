import java.util.Scanner;

class Stack{
    int n=10;
    int top=-1;
    int data;
    int a[]=new int[n];
   public void push(int data){
    if (top==n-1){
        System.out.println("Overflow");
    }
    else{
     top=top+1;
     a[top]=data;
     System.out.println("Item inserted");
    }
    
    }
    public void pop(){
        if (top==-1){
            System.out.println("Underflow");
        }
        else{
            top=top-1;
            System.out.println("Item deleted");
        }
    }
    public void display(){
        System.out.println("Items are");
        for (int j=top;j>=0;j--){    
            System.out.println(a[j]);
        }
    }

}
public class Stack_Array{
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
}}