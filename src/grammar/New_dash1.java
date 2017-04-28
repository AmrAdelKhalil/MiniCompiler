package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class New_dash1 implements New_dash {

	Expression expr;
	
	public New_dash1(Expression expr) {
		this.expr = expr;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		String res = "";
		if(q.peek().value.equals("int")){
			q.poll();
			res += "int";
			if(q.peek().value.equals("[")){
				q.poll();
				res += " [";
				res += expr.getValue(q);
				if(q.peek().value.equals("]")){
					q.poll();
					res += "]";
				}
			}
		}
		return res;
	}

}
