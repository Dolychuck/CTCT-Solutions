public class PermAndPalindrome {

	/**
	 * Palindrome permutation- Permutation of a Palindrome ***Assumptions*** All
	 * letters will be lowercase and within 128 Ascii values
	 * 
	 * @param str
	 *            The string being tested
	 * @return returns true if the string is a permutation of a palindrome
	 */
	public static boolean PermAndPal(String str) {
		str = str.replaceAll("\\s", "");
		str = str.toLowerCase();
		boolean isEven = false;
		int pairs = 0;
		int[] table = new int[128];
		if (str.length() % 2 == 0)
			isEven = true;
		for (int i = 0; i < str.length(); i++) {
			if (table[str.charAt(i) - 97] == 0)
				table[str.charAt(i) - 97]++;
			else {
				table[str.charAt(i) - 97]--;
				pairs++;
			}
		}
		System.out.println("Pairs: " + pairs + " length: " + str.length() + " Answer " + str.length() + "==" + ((pairs*2)+1)  );
		return (isEven)?(pairs*2 == str.length()):((pairs*2)+1 == str.length());
	}

	public static void main(String[] args) {
		System.out.println(PermAndPal("Tact Coa"));
		System.out.println(PermAndPal("mma"));
		System.out.println(PermAndPal("yakak"));
		System.out.println(PermAndPal("travel"));
	}

}
