//WAP to find the maximum occurring character in a String.

import java.util.Scanner;

public class maxcharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < freq[str.charAt(i)]) {
                max = freq[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println("Maximum occurring character: " + result);

	}

}
