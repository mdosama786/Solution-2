/**
 * Write a program that finds all anagram sets from a list of words. Anagrams are those words in
 * which there are same characters jumbled. For example -> GOD - DOG ARE ANAGRAMS. Both
 * words have same characters but in jumbled order. 
 * 
 * @author Osama
 */

/**@import package**/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** @Creating Class **/
public class AnagramsSets {

	/** @Main Method **/
	public static void main(String[] args) {

		/** @Creating Array **/
		String[] input = { "listen", "pot", "part", "opt", "trap", "silent", "top", "this", "hello", "hits", "what",
				"shit" };

		/** @Creating Object **/
		String[] Array = new String[input.length];

		/** @Sort and store in an new array **/
		for (int i = 0; i < input.length; i++) {
			char[] ar = input[i].toCharArray();
			Arrays.sort(ar);
			String a = new String(ar);
			Array[i] = a;
		}

		/** @Search matches and create sets */
		for (int j = 0; j < Array.length; j++) {
			List<String> array = new ArrayList<String>();

			/** @For Loop **/
			for (int k = 0; k < Array.length; k++) {
				if (Array[j].equals(Array[k])) {

					array.add(input[k]);
				}

			}

			for (String element : array) {
				System.out.print(element + " ");
			}

			/** @Output **/
			System.out.print("\n\n");
		}
	}

}
