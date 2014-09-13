/*
 * Alex is attending a Halloween party with his girlfriend Silvia. At the party,
 * Silvia spots a giant chocolate bar. If the chocolate can be served as only 1
 * x 1 sized pieces and Alex can cut the chocolate bar exactly K times, what is
 * the maximum number of chocolate pieces Alex can cut and give Silvia?
 * 
 * Input Format The first line contains an integer T, the number of test cases.
 * T lines follow. Each line contains an integer K
 * 
 * Output Format T lines. Each line contains an integer that denotes the maximum
 * number of pieces that can be obtained for each test case.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Halloween {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();

		for (int i = 1; i <= a; i++) {
			long b = in.nextLong();
			BigInteger first = new BigInteger(Long.toString(b >> 1));
			if (b % 2 != 0) {
				BigInteger second = first.add(BigInteger.ONE);
				System.out.println(first.multiply(second));
			} else {
				System.out.println(first.multiply(first));
			}
		}
	}
}