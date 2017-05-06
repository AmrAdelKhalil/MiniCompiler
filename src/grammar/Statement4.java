package grammar;
import java.util.Queue;

import Tokenizing.Lexeme;

public class Statement4 implements Statement {
	Expression expression;
	
	public Statement4(Expression expression){
		this.expression = expression;
	}
	@Override
	public String getValue() {
		String result = "\t";
		
		result += "System.out.println";
		
		result += "(";	
		result += expression.getValue();
				
		result += ")";	
	
		result += ";\n";	
				
		
		return result; 
	}

}
