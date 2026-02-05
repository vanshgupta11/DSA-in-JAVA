public class Pg3 {
    public static void main(String[] args) {
         int N = 10;
        Solution sol = new Solution() ;
        sol.printNumber(N);
    }
}

class Solution{
    public void printNumber(int current){
        if(current <1)
            return;

        System.out.println(current);
        printNumber(current -1);
    }
}