package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Final_4 implements Final_ {

	@Override
	public String getValue(Queue<Lexeme> q) {
		if(q.peek().value.equals("this")){
			q.poll();
			return "this";
		}
		return "";
	}

}
