package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Statement1 implements Statement {
	Statement statement;
	public Statement1(Statement statement){
		this.statement = statement;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "";
		if (q.peek().value.equals("{"))
		{	
			result += q.poll().value;
			result += statement.getValue(q);
			if (q.peek().value == "}")
				result += q.poll().value;
		}
		return result;
	}
	

}
