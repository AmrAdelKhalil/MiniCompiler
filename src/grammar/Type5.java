package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type5 implements Type {

	@Override
	public String getValue(Queue<Lexeme> q) {

		String result = "";

		result += "String";

		return result;
	}

}
