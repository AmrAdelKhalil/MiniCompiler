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
	public String getValue() {
		String result ="";
		result += "while";

		result += "(";
		result += expression.getValue();
	
		result += ")";
		result += statement.getValue();
			
		return result;
	}
}
