//WAP to check if “2552” is palindrome or not.

		import java.util.*;
		public class palindrome {

			public static void main(String[] args) {
					    
					    int num = 2552, reversedNum = 0, remainder;
					    
					    // store the number to originalNum
					    int originalNum = num;
					    
					    // get the reverse of originalNum
					    // store it in variable
					    while (num != 0) {
					      remainder = num % 10;
					      reversedNum = reversedNum * 10 + remainder;
					      num /= 10;
					    }
					    
					    // check if reversedNum and originalNum are equal
					    if (originalNum == reversedNum) {
					      System.out.println(originalNum + " is Palindrome.");
					    }
					    else {
					      System.out.println(originalNum + " is not Palindrome.");
					    }	  		
			}
		}		