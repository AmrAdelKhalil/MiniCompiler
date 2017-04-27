package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public interface Type {
	
	public String getValue(Queue<Lexeme> q);
	
}
