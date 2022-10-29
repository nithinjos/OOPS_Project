package Q5;
import java.util.*;
import java.lang.Math;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                                   
                                                                                
        System.out.println("Enter the size of the array: ");                   
        int n = in.nextInt();                                                  
                                                                                
        int[] array = new int[n];                                              
        System.out.println("Enter the elements of the array: ");        
        for(int i=0; i<n; i++)                                                 
        {                                                                      
            array[i]=in.nextInt();                                             
        }
        in.close();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(compare(array[i], array[j])){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        String largest = "";

        for(int i = 0; i < n; i++){
            largest += array[i];
        }

        System.out.println(largest);
    }
    public static boolean compare(int a, int b){
    /*  
        compares two numbers and returns true if first number a should come after 
        second number b in the order in the context of the question.
        e.g. while comparing 503 and 56, 56 should come first and then 503
        inorder to create the largest number possible.
    */

        int aLength = (int) (Math.log10(a) + 1);
        int bLength = (int) (Math.log10(b) + 1);
        int extra = Math.abs(aLength - bLength);
        double aNew;
        double bNew;
        if(aLength > bLength){
            bNew = b * Math.pow(10, extra);
            aNew = a;
        } else if (bLength > aLength){
            aNew = a * Math.pow(10, extra);
            bNew = b;
        } else {
            aNew = a;
            bNew = b;
        }
        if (aNew > bNew){
            return false;
        } else {
            return true;
        }
    }
}
