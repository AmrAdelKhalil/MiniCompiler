package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Expression_dash2 implements Expression_dash {

	Expression expr;
	
	public Expression_dash2(Expression expr) {
		this.expr = expr;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		String res = "";
		if(q.peek().value.equals("[")){
			res += q.poll().value;
			res += expr.getValue(q);
			if(q.peek().value.equals("]")){
				res += q.poll().value;
			}
		}
		return res;
	}

}
