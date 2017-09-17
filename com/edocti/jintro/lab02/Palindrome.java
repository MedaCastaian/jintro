package com.edocti.jintro.lab02;
import java.util.Scanner;
public class Palindrome {

    //Method to check
    private static boolean isPalindrome(String s) {
		// if length is 0 or 1 then String is palindrome
		int N = s.length();
        if (N == 0 || N == 1) {
            return true;
        }			
        if(s.charAt(0) == s.charAt(N-1)) {
        /* check for first and last char of String:
         * if they are same then do the same thing for a substring
         * with first and last char removed. and carry on this
         * until you string completes or condition fails
         * Function calling itself: Recursion
         */
        return isPalindrome(s.substring(1, N-1));
		}
        /* If program control reaches to this statement it means
         * the String is not palindrome hence return false.
         */
        return false;
    }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in); //System.in represents Standard Input Device (Keyboard)
        System.out.println("Enter the String for check:");
        String string = scanner.nextLine(); //nextLine() reads input including space between the words (that is, it reads till the end of line \n). Once the input is read, nextLine() positions the cursor in the next line.
        if(isPalindrome(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
} 
