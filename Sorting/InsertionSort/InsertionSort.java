import java.util.Scanner;

public class InsertionSort{   
    public static void main(String[] args) {
        int n,arr[],i,j,key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
         n=sc.nextInt();
         
        arr=new int[n];
        System.out.println("Enter elements");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (i=1;i<n;i++){
         key=arr[i];
         j=i-1;
         while(j>-1 && arr[j+1]<arr[j]){
            arr[j+1]=arr[j];
            j--;
         }
         arr[j+1]=key;}
         for (i=0;i<n;i++){
            System.out.println("Elements are"+arr[i]);
         }       
    }}

