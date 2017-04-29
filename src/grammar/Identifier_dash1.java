package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Identifier_dash1 implements Identifier_dash{
	Expression expression;
	public Identifier_dash1(Expression expression){
		this.expression = expression;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "=";
		result += expression.getValue(q);
		result += ";";
		return result;
	}

}
