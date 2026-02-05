public class Pg4 {
    public static void main(String[] args) {
        int N = 10;
        Solution sol = new Solution();
        System.out.println(sol.sumOfNumbers(N));  
    }
}
 class Solution{
    public int sumOfNumbers(int N){
        if(N == 1){
            return 1;
        }
        return N + sumOfNumbers(N -1 );
    }
 }