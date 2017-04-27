package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type9 implements Type{

	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
				
		if(q.peek().equals("char")){
			result += "char";
			q.poll();
			
			if(q.peek().equals("[")){
				result += "[";
				q.poll();
				
				if(q.peek().equals("]")){
					result += "]";
					q.poll();
				}
			}
		}
		return result;
	}

}
