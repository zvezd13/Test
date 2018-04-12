package anagrams;

import org.apache.commons.lang3.StringUtils;

public class ReverseLetters {
	protected String reverseLetters(String input) {
		String letters = StringUtils.removeAll(input, "(\\d|\\W|_)");
		String reverseLetters = StringUtils.reverse(letters);
		String[] lettersArray = input.split("");
		String[] reverseLettersArray = reverseLetters.split("");
		for (int i = 0, j = 0; i < lettersArray.length; i++) {
			if (StringUtils.isAlpha(lettersArray[i])) {
				lettersArray[i] = reverseLettersArray[j];
				j++;
			}
		}
		String result = StringUtils.join(lettersArray);
		return result;

	}
}
