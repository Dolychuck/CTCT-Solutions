
public class StringCompression {
	public static String comp(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 1; i < str.length(); i++) {
			char temp = str.charAt(i - 1);
			result.append(temp);
			int count = 1;
			while (i < str.length() && str.charAt(i) == temp) {
				count++;
				i++;
			}
			result.append(count);
		}
		return (result.length() < str.length()) ? result.toString() : str;
	}

	public static void main(String[] args) {
		System.out.println(comp("aabcccccaaa"));
	}
}
