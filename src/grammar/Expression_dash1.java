package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Expression_dash1 implements Expression_dash {
	
	Expression expr;
	
	public Expression_dash1(Expression expr) {
		this.expr = expr;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		String res = "";
		if(q.peek().value.equals("&&") || q.peek().value.equals("<") || q.peek().value.equals("+") || q.peek().value.equals("-") || q.peek().value.equals("*") ){
			res += q.poll().value;
			res += expr.getValue(q);
		}
		return res;
	}

}
