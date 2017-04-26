package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type4 implements Type{

	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
		
		if(q.peek().equals("float")){
			result += "float";
			q.poll();
		}
		return result;
	}

}
