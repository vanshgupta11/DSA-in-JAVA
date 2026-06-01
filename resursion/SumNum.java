public class SumNum {
    public static void main(String[] args) {
        System.out.println(printN(20));
    }
    static int printN(int n){
        if(n == 0){
            return 0;
        }else{
        return n + printN(n-1);
    }}
}
