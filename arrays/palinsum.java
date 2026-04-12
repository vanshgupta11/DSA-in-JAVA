import java.lang.*;
import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 while(true){
		     int rev = reverse(n);
		     if(rev == n){
		         System.out.println(rev);
		         break;
		     }else{
		         n= n+rev;
		     }
		     
		 }
        
	}
	
	static int reverse(int n ){
	    int rev = 0;
	    while(n>0){
	        int digit = n%10;
	        rev = rev*10+digit;
	        n = n/10;
	        
	    }
	    return rev;
	}
}
