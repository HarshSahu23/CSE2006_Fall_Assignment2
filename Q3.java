import java.util.*;
public class Q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Pattern 1\t4) Pattern 4\t7) Pattern 7\t10) Pattern 10");
        System.out.println("2) Pattern 2\t5) Pattern 5\t8) Pattern 8");
        System.out.println("3) Pattern 3\t6) Pattern 6\t9) Pattern 9");
        System.out.print("Select your choice : \t");
        int num = sc.nextInt();
        System.out.println("");
        switch (num) {
            case 1:
                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < 6; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 1; i < 6; i++) {
                    for (int j = 5; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                for (int i = 1; i < 6; i++) {
                    for (int k = 5; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 5:
                for (int i = 1; i < 6; i++) {
                    for (int k = 5; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;

            case 6:
                for (int i = 1; i < 6; i++) {
                    for (int k = 5; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2*i-1); j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i = 1, m=4; i < 5; i++,m--) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print(" ");
                    }
                    for (int j = 2*m-1; j >= 1; j--) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            
            case 7:
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 5; k >= i; k--) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
            for (int i = 1; i < 6; i++) {
                for (int k = 5; k > i; k--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
                break;

            case 8:
            for (int i = 1,n=1; i <= 50; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(n+" ");    n+=1;
                }
                System.out.println("");
            }
                break;
            case 9:
            System.out.println("Enter N : ");
            int n=sc.nextInt(); 
            System.out.print("Enter Symbol : ");
             
            char c = sc.next().charAt(0);
             
            for(int i=1;i<=n;i++)
            {
             
            for(int j=1;j<=n-i;j++)
             
            {
            System.out.print(" ");
            }
            if(i==1 || i==n)
            for(int j=1;j<=i*2-1;j++)
             
            {
            System.out.print(c);
            }
            else
            {
            for(int j=1;j<=i*2-1;j++)
             
            { 
            if(j==1 || j==i*2-1)
            System.out.print(c);
            else
             
            System.out.print(" ");
            }
            }
            System.out.println();
             
            } 
                break;
            case 10:
                Scanner scan=new Scanner(System.in);
                System.out.print("Enter the number of rows: ");  
                int rows=scan.nextInt();  
                System.out.print("Enter the symbol you want to print: ");   
                char symbol=scan.next().charAt(0);  
                for(int i=1; i<=rows; i++)  
                {  
                for(int j=rows; j>i; j--)  
                {  
                System.out.print(" ");  
                }  
                System.out.print(symbol);  
                for(int j=1; j<(i-1)*2; j++)  
                {  
                System.out.print(" ");  
                }  
                if(i==1)  
                {  
                System.out.print("\n");  
                }  
                else  
                {  
                System.out.print(symbol+"\n");  
                }  
                }    
                for(int i=rows-1; i>=1; i--)  
                {  
                for(int j=rows; j>i; j--)  
                {  
                System.out.print(" ");  
                }  
                System.out.print(symbol);  
                for(int j=1; j<(i-1)*2; j++)  
                {  
                System.out.print(" ");  
                }  
                if(i==1)  
                {  
                System.out.print("\n");  
                }  
                else  
                {  
                System.out.print(symbol+"\n");  
                }  
                }  
                break;
            default:
                break;
        }
        sc.close();
    }
}
