package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type5 implements Type{

	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
		
		if(q.peek().equals("String")){
			result += "String";
			q.poll();
		}
		return result;
	}

}
