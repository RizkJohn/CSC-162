package labAssignment_2;

import java.util.Scanner;

public class PalindromeDetector {
	public static void main(String[] args) {
		//get a word from user
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Please enter a word: ");
		word = input.nextLine();
		word = word.toLowerCase();
		
		//check first and last symbols
		//continue checking until reach the middle
		
		int left = 0; //first index value
		int right = word.length() - 1; //last index value
		boolean isPalindrome = true;
		
		while (left < right) {
			//while looping, check the symbols to see if they're equal.
			//if it is not a palindrome
			if (word.charAt(left) != word.charAt(right)) {
				isPalindrome = false;
				System.out.println("not a palindrome, try again");
				break;	
			}
			// move to the next position
			left++;
			right--;
		}
		//if it is a palindrome...
		if(isPalindrome == true) {
		System.out.println("this is a palindrome");	
		}
		
	}

}
