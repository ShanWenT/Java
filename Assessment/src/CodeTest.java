import java.util.ArrayList;
import java.util.List;

public class CodeTest {
	public static void main(String[] args) {
		String[] inputs = new String[] { "below", "car", "chin", "elbow", "late", "state", "study", "taste", "teal",
				"tale" };
		List<Integer> outputs = new ArrayList<>();
		for (int i = 0; i < inputs.length; i++) {
			int mainCount = 0;
			for (int j = 0; j < inputs.length; j++) {
				if (j != i && inputs[i].length() == inputs[j].length()) {
					mainCount += checkAnagram(inputs[i], inputs[j]);
				}
			}
			outputs.add(mainCount);
			System.out.println(inputs[i] + " " + outputs.get(i));
		}
	}

	static int checkAnagram(String word, String word2) {
		int count = 0;
		int check = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {

				if (word.charAt(i) == word2.charAt(j))
					check++;
			}
		}
		if (check >= word.length())
			count++;

		return count;
	}

}
