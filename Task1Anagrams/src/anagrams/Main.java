package anagrams;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public class Main {
	public static void main(String[] args) throws IOException {
		Input input = new Input();
		ReverseLetters reverse = new ReverseLetters();
		DivideWords divide = new DivideWords();

		String[] separateWords = divide.divideWords(input.inputExpression());
		String[] resultArray = new String[separateWords.length];
		for (int i = 0; i < separateWords.length; i++) {
			resultArray[i] = reverse.reverseLetters(separateWords[i]);
		}
		String result = StringUtils.join(resultArray, " ");
		System.out.println(result);
	}
}
