package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type3 implements Type {

	@Override
	public String getValue(Queue<Lexeme> q) {

		String result = "";

		result += "int";

		return result;
	}

}
