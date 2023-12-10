import java.util.Arrays;
import java.util.Scanner;

public class Array {
    int arr[] = {4, 1, 8, 2};  


    int val,loc;

   public void insertion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int val=sc.nextInt();
        System.out.println("Enter loc");
        int loc=sc.nextInt();
        for(int i=4; i>loc; i--){
            // 	arr[i+1]=arr[i];
                 arr[i]=arr[i-1];	
             }
             arr[loc]=val;
          
        
    
   }
   public void print(){
    for (i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
   }
    public static void main(String[] args) {
        Array a=new Array();
        a.insertion();
    }
}
