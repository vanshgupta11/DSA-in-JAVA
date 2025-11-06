import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango":
                System.out.println("king of fruits");
                break;
            case "Apple":
                System.out.println("A red fruit");
                break;
            case "Banana":
                System.out.println("A yellow fruit");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
