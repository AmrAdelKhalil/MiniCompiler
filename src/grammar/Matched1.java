package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Matched1 implements Matched{
	Expression expression ;
	Matched left,right;
	public Matched1(Expression expression,Matched left,Matched right){
		this.expression = expression;
		this.left = left;
		this.right = right;
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
					result += left.getValue(q);
					if(q.peek().value.equals("else"))
					{
						result += q.poll().value;
						result += right.getValue(q);
					}
				}
			}
				
		}
		return result;
	}
	
}
