import java.util.ArrayList;
import java.util.Scanner;

public class firstNegativeNumber {
    public static void main(String[] args) {
        // find first negative number in every window of size k
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

        // list for ans
        ArrayList<Integer> ans = new ArrayList<>();
        // list for negative values
        ArrayList<Integer> negativeList = new ArrayList<>();
        int i = 0, j = 0;
        while (j < arr.length ) {
            // calculation
            if (arr[j] < 0) {
                negativeList.add(arr[j]);
            }
            // window size is less
            if ((j - i + 1) < k) {
                j++;
            }

            // window size equals
            else if ((j - i + 1) == k) {
                System.out.println("Negative list on iteration of i,j as " + i+j + " is " + negativeList);
                // find answer
                if (negativeList.isEmpty()) {
                    ans.add(0);
                }
                
                else {
                    ans.add(negativeList.get(0));
                    // release
                    if (negativeList.get(0) == arr[i]) {
                        negativeList.remove(0);
                    }
                }

                // slide window
                i++;
                j++;
            }
        }
        // System.out.println("Negative list is " +negativeList);
        System.out.println("Answer list is " +ans);
    }
}