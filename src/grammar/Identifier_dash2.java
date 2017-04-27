package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Identifier_dash2 implements Identifier_dash{
	Expression left,right;
	public Identifier_dash2(Expression left,Expression right){
		this.left = left;
		this.right = right;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "";
		if(q.peek().value.equals("["))
		{
			result += q.poll().value;
			result += left.getValue(q);
			if(q.peek().value.equals("]"))
			{
				result += q.poll().value;
			}
		}
		if(q.peek().value.equals("="))
		{
			result += q.poll().value;
			result += right.getValue(q);
			if(q.peek().value.equals(";"))
			{
				result += q.poll().value;
			}
		}
		return result;
	}

}
