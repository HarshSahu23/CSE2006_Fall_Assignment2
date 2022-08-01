import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String isPrime = " is a prime number";
        for (int i = 2; i < num; i++) {
            if ((num%i==0)||(num==0)) {
                isPrime=" is not a prime number";
                break;
            }
        }
        if (num==0) {
            isPrime=" is not a prime number";
        }
        System.out.println(num+isPrime);
        sc.close();
    }
}
