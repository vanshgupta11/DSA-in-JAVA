public class Nnumbes {
    public static void main(String[] args) {
        printN(5);
    }
    static void printN(int n){
        if(n == 1){
            System.out.println(1);
        }
        else{
            printN(n-1);
            System.out.println(n);
        }
    }
}
