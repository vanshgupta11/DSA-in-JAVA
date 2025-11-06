import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch (fruit) {
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("A red fruit");
            case "Banana" -> System.out.println("A yellow fruit");
            default -> System.out.println("Unknown fruit");
        }
    }
}

