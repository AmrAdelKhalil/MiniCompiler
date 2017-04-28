package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Final_3 implements Final_ {

	@Override
	public String getValue(Queue<Lexeme> q) {
		if(q.peek().value.equals("false")){
			q.poll();
			return "false";
		}
		return "";
	}

}
