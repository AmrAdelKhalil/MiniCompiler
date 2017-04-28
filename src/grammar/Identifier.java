package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public interface Identifier {
	public String getValue(Queue<Lexeme> q);
}
