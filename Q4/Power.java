package Q4;
import java.util.*;

public class Power {

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int a = power(x, n/2);

        if(n % 2 != 0){
            return a * a * x;
        } else {
            return a * a;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                                   
                                                                                
        System.out.println("Enter the value of x: ");                   
        int x = in.nextInt();  

        System.out.println("Enter the value of n: ");                   
        int n = in.nextInt();  
        
        in.close();

        int p = power(x, n);
        System.out.println("Power of " + x + " over " + n + " is: " + p);
    }
}
