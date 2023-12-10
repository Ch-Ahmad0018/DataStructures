import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;
    public Node (int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class tree{
  
    static Node create(){
        int data;  
   Scanner sc=new Scanner(System.in);
   Node root=null;
   System.out.println("Enter value");
   data=sc.nextInt();
   if (data==-1)
    return null;
   
   root=new Node(data);
   System.out.println("Enter left child of "+root);
   root.left=create();
   System.out.println("Enter right child of "+root);
   root.right=create();
   return root;
    }
    public static void main(String[] args) {
        Node root=create();
    }
}
