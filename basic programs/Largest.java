import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
         if(a>b&& a>c){
            System.out.println("a is largest");

         }
         else if(b>a && b >c){
            System.out.println("b is largest");

         }
         else{
            System.out.println("c is largest");

         }
    }
}
