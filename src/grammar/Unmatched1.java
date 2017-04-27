package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Unmatched1 implements Unmatched{
	Expression expression;
	Unmatched_dash unmatched_dash;
	public Unmatched1(Expression expression,Unmatched_dash unmatched_dash){
		this.expression = expression;
		this.unmatched_dash = unmatched_dash;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "";
		if (q.peek().value.equals("if"))
		{
			result = q.poll().value;
			if(q.peek().value.equals("("))
			{
				result += q.poll().value;
				result += expression.getValue(q);
				if(q.peek().value.equals(")"))
				{
					result += q.poll().value;
					result += unmatched_dash.getValue(q);
				}
			}
		}
		return result;
	}

}
