import java.util.*;

public class Q1
{
    public static void main(String[] args)
    {
        System.out.println("Printing first n odd numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.println("");
        for (int i=1,k=1; i <= 2*n; i+=2,k+=1) {
                System.out.print(i+" ");
            if (k%Math.sqrt(2*n)==0) {
                System.out.println("");
            }
        }
        sc.close();
    }
}