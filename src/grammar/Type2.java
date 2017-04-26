package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type2 implements Type{

	@Override
	public String getValue(Queue<Lexeme> q) {
		String result = "";
		
		if(q.peek().equals("boolean")){
			result += "boolean";
			q.poll();
		}
		return result;
	}

}
