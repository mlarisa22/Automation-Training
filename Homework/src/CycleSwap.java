
import java.util.Scanner;

public class CycleSwap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,shift;

        System.out.println("Enter the number of elements:") ;
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Numbers:") ;
        for(i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        // shift position
        shift = a[n-1];
        for(i=n-1;i>0;i--) {
            a[i] = a[i - 1];
        }
        a[0] = shift;
        System.out.println("Shifted:");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

