public class Reverse {
      public static void main(String[] args) {
        ReverseN(134);
        System.out.println(sum);
    }
    static int sum = 0;
    static void ReverseN(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem ;
        ReverseN(n/10);
    }
}
