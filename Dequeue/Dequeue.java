import java.util.Scanner;

class Queue {
    int n = 5;
    int f = -1;
    int r = -1;
    int data;

    int a[] = new int[n];

    public void Enqueue(int data) {
        if (r == n - 1) {
            System.out.println("Overflow This data is not inserted");
        } else if (f == -1 && r == -1) {
            f = f + 1;
            r = r + 1;
            a[r] = data;
        } else {
            r = r + 1;
            a[r] = data;
        }
    }

    public void EnqueueFirst(int data) {
        if (f == -1) {
            System.out.println("Data can't be inserted");
        } else {
            f = f - 1;
            a[f] = data;
        }
    }

    public void Dequeue() {
        if (f == -1 && r == -1) {
            System.out.println("Underflow");
        } else {
            f = f + 1;
        }
    }

    public void DequeueLast() {
        if (f == -1 && r == -1) {
            System.out.println("Underflow");
        } else {
            r = r - 1;
        }
    }

    public void display() {
        System.out.println("Items are");
        for (int j = 0; j <= r; j++) {
            System.out.println(a[j]);
        }
    }
}

public class Dequeue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int data;

        Queue s = new Queue();
        int b = 1;
        int k = 0;
        while (k != 4) {
            System.out.println("Enter 1 to push 2 to pop 3 to display 4 to end 5 to Enqueue first 6 to delete from last");
            k = sc.nextInt();
            if (k == 1) {
                System.out.println("Enter data");
                data = sc.nextInt();
                s.Enqueue(data);
            } else if (k == 2) {
                s.Dequeue();
            } else if (k == 3) {
                s.display();
            }
            else if (k==5){
                System.out.println("Enter data");
                data = sc.nextInt();
                s.EnqueueFirst(data);
            }
            else if (k==6){
                s.DequeueLast();
            }

        }
    }
}