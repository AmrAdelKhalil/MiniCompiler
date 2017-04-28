package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Dot_dash1 implements Dot_dash {

	public Dot_dash1() {

	}
	@Override
	public String getValue(Queue<Lexeme> q) {

		return "length";
	}

}
