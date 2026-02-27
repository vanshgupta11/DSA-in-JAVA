
import java.util.*;
public class ReArrange {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int[] ans = new int[n];

        int start = 0;
        int end = n - 1;
        int j = 0;

        while(start < end){
            ans[j++] = arr[start++];
            ans[j++] = arr[end--];
        }
        if(start == end){
            ans[j] = arr[start];
        }

        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}