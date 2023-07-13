//WAP to print Duplicates characters from the String.
import java.util.Scanner;

public class Duplicatescharacters {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string:");
	        String str = sc.nextLine();
	        int count;
	        char[] strArray = str.toCharArray();
	        System.out.println("Duplicate characters in the given string:");
	        for (int i = 0; i < strArray.length; i++) {
	            count = 1;
	            for (int j = i + 1; j < strArray.length; j++) {
	                if (strArray[i] == strArray[j] && strArray[i] != ' ') {
	                    count++;
	                    strArray[j] = '0';
	                }
	            }
	            if (count > 1 && strArray[i] != '0') {
	                System.out.println(strArray[i]);
	            }
	        }
	    }
	}
