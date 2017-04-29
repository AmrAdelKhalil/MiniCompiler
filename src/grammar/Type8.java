package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type8 implements Type {

	@Override
	public String getValue(Queue<Lexeme> q) {

		String result = "";

		result += "String";

		result += "[";

		result += "]";

		return result;
	}

}
