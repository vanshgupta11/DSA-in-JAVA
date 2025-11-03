import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int rev = 0;
        while(a!=0){
            int digit = a %10 ;
            rev = rev*10 + digit;
            a = a / 10;
        }

        if(rev==b){
            System.out.println("palindrome");
        }
        else{
             System.out.println("not a palindrome");
        }
    }
}
