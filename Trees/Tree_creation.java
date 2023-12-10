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
public class Tree_creation{
   public static Node buildTree(){
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nodes");
        d=sc.nextInt();
        if(d==-1){
            return null;
        }
        Node newNode=new Node(d);
        newNode.left=buildTree();
        newNode.right=buildTree();
        return newNode;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
       System.out.println(root.data);
        inorder(root.right);
    }
    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        Tree_creation t=new Tree_creation();
      
      Node root=t.buildTree();
      System.out.println("Preorder of binary tree is");
      preorder(root);
    }
}