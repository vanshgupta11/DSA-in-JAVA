public class Pg2 {
    public static void main(String[] args) {
        int N = 10;
        Solution sol = new Solution() ;
        sol.printNumber(1, N);
    }
}

class Solution{
    public void printNumber(int current , int N){
        if(current > N)
            return ;

        System.out.println(current);

        printNumber(current +1 , N);

    }
}