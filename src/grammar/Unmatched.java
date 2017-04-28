package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public interface Unmatched {
	public String getValue(Queue<Lexeme>q);
}
