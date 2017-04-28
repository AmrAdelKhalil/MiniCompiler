package grammar;


import java.util.Queue;

import Tokenizing.Lexeme;

public class Type1 implements Type {

	@Override
	public String getValue(Queue<Lexeme> q) {
		
		String result = "";
		
		if(q.peek().equals("int")){
			result += "int";
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
