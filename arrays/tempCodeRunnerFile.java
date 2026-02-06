import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        int[] arr1 = {2,5,3,7,8,4};
        System.out.println(Solution.sortArr(arr1));
        
    }
}

class Solution{
    public static int sortArr(int[] arr){
            Arrays.sort(arr);
            return arr[arr.length -1] ;
            }
}