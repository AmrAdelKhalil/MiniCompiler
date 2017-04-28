package grammar;

import Tokenizing.*;

import java.util.Queue;

public interface Goal {

	public String getValue(Queue<Lexeme> q);
	
}
