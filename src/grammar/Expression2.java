package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Expression2 implements Expression {

	Expression expr;
	Expression_double_dash EDD;
	
	public Expression2(Expression expr, Expression_double_dash EDD) {
		this.expr = expr;
		this.EDD = EDD;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		String res = "";
		if(q.peek().value.equals("!")){
			q.poll();
			res += "!";
			res += expr.getValue(q);
			res += EDD.getValue(q);
		}
		return res;
	}

}
