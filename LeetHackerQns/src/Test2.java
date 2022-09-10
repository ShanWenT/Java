
public class Test2 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		String[] words = { "Hello world", "welcome world", "dark world", "mighty world", "abc def ghijklmnopqrstuvwxyz",
				"testing1234567891234567891", "wxyz vutsrq ponmlkjih gfedcba", "QWERTYUIOP ASDFGHJKL ZXCVBNM" };
		String word;

		for (int i = 0; i < words.length; i++) {
			word = words[i].replaceAll("\\s", "").toLowerCase();

			if (word.length() == 26) {
				if (check(word.substring(0, 13)) == true && check(word.substring(13, 26))==true)

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
		if (counter == 13)
			result = true;
		return result;

	}

}