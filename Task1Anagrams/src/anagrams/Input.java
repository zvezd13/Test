package anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	protected String inputExpression() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String inputline = input.readLine();
		return inputline;
	}
}
