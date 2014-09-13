/*
 * The Utopian tree goes through 2 cycles of growth every year. The first growth
 * cycle of the tree occurs during the monsoon, when it doubles in height. The
 * second growth cycle of the tree occurs during the summer, when its height
 * increases by 1 meter. Now, a new Utopian tree sapling is planted at the onset
 * of the monsoon. Its height is 1 meter. Can you find the height of the tree
 * after N growth cycles?
 * 
 * Input Format The first line contains an integer, T, the number of test cases.
 * T lines follow. Each line contains an integer, N, that denotes the number of
 * cycles for that test case.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int _a, b, result;
		_a = in.nextInt();

		for (int i = 1; i <= _a; i++) {
			b = in.nextInt();
			if (b == 0)
				result = 1;
			else if (b % 2 == 0) {
				int pow = (b >> 1) - 1;
				result = (((2 << pow) - 1) << 1) + 1;
			} else {
				int pow = ((b + 1) >> 1) - 1;
				result = ((2 << pow) - 1) << 1;
			}
			System.out.println(result);
		}
	}
}