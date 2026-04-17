import java.util.*;
class Occur{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
         String s2 = sc.nextLine();
         int count = 0;
         for(int i =0;i<s1.length()-s2.length();i++){
            if(s1.contains(s2)){
                count++;
            }
         }
         System.out.println(count);
    }
}