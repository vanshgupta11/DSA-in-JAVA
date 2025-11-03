import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int mul = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num ; i>=1; i--){
            mul = mul*i;
        }
        System.out.println(mul);
    }
}
