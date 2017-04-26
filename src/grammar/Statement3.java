package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Statement3 implements Statement {
	Expression expression;
	Statement statement;
	public Statement3(Expression expression,Statement statement){
		this.expression = expression;
		this.statement = statement;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result ="";
		if (q.peek().value.equals("while")){
			result += q.poll();
			result += expression.getValue(q);
			if (q.peek().value.equals(")"))
			{
				result += q.poll();
				result += statement.getValue(q);
			}
		}
		return result;
	}

}
