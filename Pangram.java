//WAP to implement Pangram Checking with least inbuilt methods being used.
//pangram --a sentence containing every letter of the alphabet.
//example--The quick brown fox jumps over the lazy dog" (which has 35 letters)

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = scanner.nextLine().toLowerCase();
	        boolean[] mark = new boolean[26];
	        int index = 0;
	        for (int i = 0; i < str.length(); i++) {
	            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
	                index = str.charAt(i) - 'a';
	            }
	            mark[index] = true;
	        }
	        boolean pangram = true;
	        for (int i = 0; i <= 25; i++) {
	            if (mark[i] == false) {
	                pangram = false;
	            }
	        }
	        if (pangram) {
	            System.out.println("The string is a pangram.");
	        } else {
	            System.out.println("The string is not a pangram.");
	         }
	 
	}}