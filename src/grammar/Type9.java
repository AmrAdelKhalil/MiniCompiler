package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type9 implements Type {

	@Override
	public String getValue(Queue<Lexeme> q) {

		String result = "";

		result += "char";

		result += "[";

		result += "]";

		return result;
	}

}
