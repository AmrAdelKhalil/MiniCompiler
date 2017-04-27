package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public interface Matched {
	public String getValue(Queue<Lexeme>q);
}
