package grammar;
import java.util.Queue;

import Tokenizing.Lexeme;

public class Statement4 implements Statement {
	Expression expression;
	
	public Statement4(Expression expression){
		this.expression = expression;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "";
		if(q.peek().value.equals("System.out.println"))
		{
			result = q.poll().value;
			if(q.peek().value.equals("("))
			{
				result += q.poll().value;	
				result += expression.getValue(q);
				if(q.peek().value.equals(")"))
				{
					result += q.poll().value;	
					if(q.peek().value.equals(";"))
					{
						result += q.poll().value;	
					}
				}
			}
		}
		return result; 
	}

}
