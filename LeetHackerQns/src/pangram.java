
public class pangram {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		String[] words = { "Hello world", "welcome world", "dark world", "mighty world", "abc def ghijklmnopqrstuvwxyz",
				"testing1234567891234567891", "wxyz vutsrq ponmlkjih gfedcba", "QWERTYUIOP ASDFGHJKL ZXCVBNM" };
		String word;

		for (int i = 0; i < words.length; i++) {
			word = words[i].replaceAll("\\s", "").toLowerCase();

			if (word.length() == 26) {
				if (check(word) == true)

					System.out.println(words[i]);

			}
		}

		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
	}

	public static boolean check(String word) {
		String ea = "abcdefghijklmnopqrstuvwxyz";
		int counter = 0;
		boolean result = false;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < ea.length(); j++) {
				if (word.charAt(i) == ea.charAt(j))
					counter++;
			}
		}
		if (counter == 26)
			result = true;
		return result;

	}

}
