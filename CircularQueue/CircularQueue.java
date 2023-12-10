import java.util.Scanner;

class Queue{
    int n=3;
    int f=-1;
    int r=-1;
    int data;
    int a[]=new int[n];
   
    public void Enqueue(int data){
        if (f==(r+1)%n){
            System.out.println("Overflow and data is not inserted");
        }
        else if 
         (f==-1&&r==-1){
        f=0;
        r=0;
        a[r]=data;
        }
        else{
       r=(r+1)%n;
        a[r]=data;
        }
    }
    public void Dequeue(){
        if (f==-1&&r==-1){
            System.out.println("Underflow");
        }
        else if(f==r) {
         
         f=-1;
         r=-1;
        }
        else{
            f=(f+1)%n;
        }
    }
    public void display(){
     System.out.println("Items are");
     int j=f;
    while(j!=r){
     System.out.println(a[j]);
     j=(j+1)%n;
       }
     System.out.println(a[j]);
        }
    }
public class CircularQueue{
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
}}}