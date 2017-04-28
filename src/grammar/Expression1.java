package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Expression1 implements Expression {

	Final_ F;
	Expression_double_dash EDD; 
	
	public Expression1(Final_ F, Expression_double_dash EDD) {
		this.F = F;
		this.EDD = EDD;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		String res = "";
		res += F.getValue(q);
		res += EDD.getValue(q);
		return res;
	}

}
