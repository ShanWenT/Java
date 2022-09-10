package Assessment;

import java.util.ArrayList;
import java.util.List;

//Quiz 2
//Task: Take in a list of x words, compare all x words and identify the occurrences of words which are anagrams to one another.
//What is Anagram - A word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.
// 
//Input    Output
//below    below 1
//car         car 0
//chin       chin 0
//elbow    elbow 1
//late        late 2
//state      state 1
//study     study 0
//taste      taste 1
//teal        teal 2
//tale        tale 2
// 
//Sample base to start with:
//public class TestClass {
//    public static void main(String[] args) {        
//        String[] inputs = new String[] { "below", "car", "chin", "elbow", "late", "state", "study", "taste", "teal", "tale" };
// 
//        
//
//    }
// 
//    // add your methods here
//}
//Note:
//1. You are allowed to google or reference any material as you solve this problem
//2. You may use any programming language that you are comfortable with.
//3. If you do not have any IDE, you may use https://www.jdoodle.com/
//4. Once completed, you may email to michael.ngien@maventree.sg

public class MavenTree {
	public static void main(String[] args) {
		String[] inputs = new String[] { "below", "car", "chin", "elbow", "late", "state", "study", "taste", "teal",
				"tale", "arc" };

		List<Integer> outputs = new ArrayList<>();
		

		for (int i = 0; i < inputs.length; i++) {
			int mainCount = 0;
			for (int j = 0; j < inputs.length; j++) {
				if (j != i && inputs[i].length() == inputs[j].length()) {
					
					mainCount += checkAnagram(inputs[i], inputs[j]);
				}
			}
			outputs.add(mainCount);
			
			System.out.println(inputs[i]+" "+outputs.get(i));
			
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
