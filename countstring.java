//WAP to count the number of consonants, vowels, special characters in a String.

//special character-A character that does not fall under the category of either alphabet or a number is called a special character. 
//example-	!,",#,$,%,&,',(,),*,+,	,	‑

//vowels-a, e, i, o, u

//Consonants are letters that represent certain speech sounds, specifically sounds that involve blocking the air before it leaves the mouth, such as with the tongue, lips, or throat
//consonants(B, C, D, F, G, J, K, L, M, N, P, Q, S, T, V, X, Z and often H, R, W, Y)

import java.util.Scanner;

public class countstring {

	public static void main(String[] args) {
		 int vowels_count, consonants_count, splchar_count;
	      String my_str;
	      vowels_count = 0;
	      consonants_count = 0;
	      splchar_count =0;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("A scanner object has been defined ");
	      System.out.print("Enter a statement: ");
	      my_str = scanner.nextLine();
	      my_str = my_str.toLowerCase();
	      for (int i = 0; i < my_str.length(); ++i) {
	         char ch = my_str.charAt(i);
	         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            ++vowels_count;
	         }
	         else 
	         if ((ch >= 'a' && ch <= 'z')) {
	            ++consonants_count;
	         }
	         else
	        	 if(ch == '!' ||ch == '@' ||ch == '#' ||ch == '$' ||ch == '%' ||ch == '^' ||ch == '&' ||ch == '*' ||ch == '(' ||ch == ')' ||ch == '[' ||ch == ']' ||ch == '{' || ch == '}' ||ch == '"'||ch == '?' ||ch == '<' ||ch == '>') {
	        		 ++splchar_count;
	        	 }
	      }
	      System.out.println("The number of vowels in the statement is: " + vowels_count);
	      System.out.println("The number of Consonants in the statement is: " + consonants_count);
	      System.out.println("The number of Consonants in the statement is: " + splchar_count);
	}
}
