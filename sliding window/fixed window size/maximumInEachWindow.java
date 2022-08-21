/* the task is to find maximum of element in a given window size
input a[]= {1,2,-3} and k=2
output: {2,2} */
import java.util.Scanner;
public class maximumInEachWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter window size k: ");
        int k = sc.nextInt();
        System.out.println("Enter array size n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element of array one by one");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE, i = 0, j = 0;
        while(j<arr.length)
        {
            //calculation
            max = Math.max(max, arr[j]);

            //less
            if((j-i+1)<k)
            {
                j++;
            }

            //equals
            else if((j-i+1)==k)
            {
                //find answer
                System.out.println(max);
                
                //release
                max = arr[i + 1];
                
                //slide window
                i++;
                j++;
            }
        }
    }
}