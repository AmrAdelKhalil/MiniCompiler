package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type6 implements Type {

	@Override
	public String getValue(Queue<Lexeme> q) {

		String result = "";

		result += "char";
		return result;
	}

}
