//You are given a string S. Split S in two parts from the midpoint, reverse each part and join them to form a new string T. Check whether T is a palindrome or not. Print T followed by "True" (without quotes), if T is a palindrome or "False" (without quotes) otherwise.

//If the length of S is odd, include the middle character in the right part while splitting. A string is said to be palindrome if it remains the same on reading from both ends.

import java.util.Scanner;

public class CheckPalin {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();

    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    for(int i = 1; i < n/2; i++){
        sb1.append(s.charAt(i));
    }

    for(int i = n/2; i < n; i++){
        sb2.append(s.charAt(i));
    }

    sb1.reverse();
    sb2.reverse();

    StringBuilder sb3 = new StringBuilder();
    sb3.append(sb1).append(sb2);

    StringBuilder sb4 = new StringBuilder(sb3);
    sb4.reverse();

    if(sb3.toString().equals(sb4.toString())){
        System.out.println(sb3 + " " + "True");
    } else {
        System.out.println(sb3 + " " + "False");
    }
}
}
