package Q3;
import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                                   
                                                                                
        System.out.println("Enter the size of the array: ");                   
        int n = in.nextInt();                                                  
                                                                                
        int[] array = new int[n];                                              
        System.out.println("Enter the elements of the sorted array: ");        
        for(int i=0; i<n; i++)                                                 
        {                                                                      
            array[i]=in.nextInt();                                             
        }                                                                      
                                                                                
        System.out.println("Enter the target number: ");                       
        int target = in.nextInt();                                             
        in.close();
        
        int left = 0;
        int right = array.length - 1;
        while(right >= left){
            int sum = array[left] + array[right];
            if(sum == target){
                System.out.println("[ " + left + ", " + right + " ]");
                return;
            } else if (sum > target){
                right--;
            } else {
                left++;
            }
        }
        System.out.println("No solution");
    }
}
