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
		String res = "[";
		res += expr.getValue(q);
		res += "]";
		return res;

	}

}
