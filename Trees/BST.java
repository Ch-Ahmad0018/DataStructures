public class BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            
        }
}
    public static Node insert(Node root,int val){
        if (root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
        root.left =insert(root.left, val);
        }
        else{
        root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }
    public static boolean Search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
           return Search(root.left, key);
        }
        else if (root.data==key){
            return true;
        }
        else{
            return Search(root.right, key);
        }
    }
    public static Node delete(Node root,int key){
        if(root.data>key){
             root.left=delete(root.left, key);
        }
        else if(root.data<key){
             root.right=delete(root.right, key);
        }
        else{
            if(root.left==null&&root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            Node IS=inordersuccessor(root.right);
            root.data=IS.data;
           root.right= delete(root.right, IS.data);
        }
         return root;
    }
    public static Node inordersuccessor(Node root){
    while(root.left!=null){
        root=root.left;
    }
    return root;
    }
    
    public static void main(String[] args) {
        
        Node root=null;
        int values[]={20,34,12,56,78};
        for (int i=0;i<values.length;i++){
            root=insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
       if( Search(root, 12)){
        System.out.println("Found");
       }
       else {
        System.out.println("Not found");
       }
     delete(root, 34);
     inorder(root);
    }
}
