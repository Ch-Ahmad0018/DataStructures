import java.util.Scanner;
public class Selection{

    public static void main(String[] args) {
        int i,j,n,loc,arr[],temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of elements");
         n=sc.nextInt();
         arr=new int[n];
        System.out.println("Enter Array elements");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (i=0;i<n-1;i++){
            loc=i;
            for (j=i+1;j<n;j++){
                if(arr[j]<arr[loc]){
                    loc=j;
}}
         if(loc!=i){
            temp=arr[i];
            arr[i]=arr[loc];
            arr[loc]=temp;
        }}
       for(i=0;i<n;i++){
        System.out.println(arr[i]);
       }
    }
}