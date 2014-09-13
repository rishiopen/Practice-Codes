/*
 * John has discovered various rocks. Each rock is composed of various elements,
 * and each element is represented by a lowercase latin letter from 'a' to 'z'.
 * An element can be present multiple times in a rock. An element is called a
 * 'gem-element' if it occurs at least once in each of the rocks.
 * 
 * Given the list of N rocks with their compositions, display the number of
 * gem-elements that exist in those rocks.
 * 
 * Input Format The first line consists of N, the number of rocks. Each of the
 * next N lines contain rocks' composition. Each composition consists of
 * lowercase letters of English alphabet.
 * 
 * Output Format Print the number of gem-elements that are common in these
 * rocks. If there are none, print 0.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemElement {

	static char[] getUniqueCharacterArray(String string) {
		char[] chars = string.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		return (sb.toString().toCharArray());
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int _a;
		_a = in.nextInt();
		int[] a = new int[26];
		int count = 0;
		for (int i = 1; i <= _a; i++) {
			String s = in.next();
			char[] ch = getUniqueCharacterArray(s);
			for (char c : ch) {
				if (++a[c - 'a'] == _a) {
					count++;
				}
			}
		}
		System.out.print(count);
	}
}