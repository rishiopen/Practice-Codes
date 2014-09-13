/*James found a love letter his friend Harry has written for his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows 2 rules:

(a) He can reduce the value of a letter, e.g. he can change 'd' to 'c', but he cannot change 'c' to 'd'. 
(b) In order to form a palindrome, if he has to repeatedly reduce the value of a letter, he can do it until the letter becomes 'a'. Once a letter has been changed to 'a', it can no longer be changed.

Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome. 
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveLetter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		for (int i = 1; i <= a; i++) {
			char[] string = in.next().toCharArray();
			int si = 0, ei = string.length - 1, count = 0;
			while (si < ei) {
				if (string[si] > string[ei])
					count += (string[si] - string[ei]);
				else
					count += (string[ei] - string[si]);
				si++;
				ei--;
			}
			System.out.println(count);
		}
	}
}