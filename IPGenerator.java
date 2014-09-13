/*Given a string containing only digits, restore it by returning all possible valid IP address combinations. 

For example: 
Given "25525511135", 

return ["255.255.11.135", "255.255.111.35"]*/

public class IPGenerator {

	public static void main(String[] args) {
		String s = "25525511135";
		generateIP(s, "");
	}

	private static void generateIP(String s, String t) {
		if (s.isEmpty()) {
			int count = 0;
			for (char c : t.toCharArray()) {
				if (c == '.')
					count++;
			}
			if (count == 4)
				System.out.println(t.substring(0, t.length() - 1));
		}

		for (int i = 3; i > 0; i--) {
			if (s.length() < i)
				continue;
			String temp = s.substring(0, i);
			if (Integer.parseInt(temp) > 255)
				continue;
			generateIP(s.substring(i), t + temp + ".");
		}
	}
}