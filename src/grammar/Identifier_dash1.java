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
		String result = "";
		if(q.peek().value.equals("="))
		{
			result += q.poll().value;
			result += expression.getValue(q);
			if(q.peek().value.equals(";"))
			{
				result += q.poll().value;
			}
		}
		return result;
	}

}
