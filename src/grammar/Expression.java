package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public interface Expression {
	public String getValue(Queue<Lexeme> q);
}	
