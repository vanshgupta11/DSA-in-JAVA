public class ProductDigit {
     public static void main(String[] args) {
        System.out.println(Sumdigit(1234));
    }
    static int Sumdigit(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * Sumdigit(n/10);
    }
}


