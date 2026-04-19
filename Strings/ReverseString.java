import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i] != ""){
                StringBuilder st =  new StringBuilder(arr[i]);
                 st.reverse();
                if(sb.length()>0){
                    sb.append(" ");
                    
                }
                sb.append(st);
            }

        }
        System.out.println(sb.toString());
    }
      
}
