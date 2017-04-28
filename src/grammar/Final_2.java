package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Final_2 implements Final_ {

	@Override
	public String getValue(Queue<Lexeme> q) {
		
		if(q.peek().value.equals("true")){
			q.poll();
			return "true";
		}
		return "";
	}
}
