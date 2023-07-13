//WAP to remove Duplicates from a String.(Take any String ex with duplicatescharacter)

import java.util.Scanner;

public class removeDuplicates  {

	public static void main(String[] args) {
		
		 String inputString;
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        inputString = scanner.nextLine();

	        char[] characters = inputString.toCharArray();
	        String result = "";

	        for (int i = 0; i < characters.length; i++) {
	            if (inputString.indexOf(characters[i]) == i) {
	                result += characters[i];
	            }
	        }

	        System.out.println("\nString after removing duplicates: " + result);
	}}
