
public class Pg1{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5 ;
        String name = "Vansh";

        sol.printname(name, 0, N);
        System.out.println("the name is printed"+ N +"times");
        
    }
}

class Solution{
    public void printname(String name ,int count, int N){
        if(count == N)
            return;

        System.out.println(name);

        printname(name, count+1, N);
        
    }

}