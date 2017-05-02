package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class New_dash1 implements New_dash {

	Expression expr;
	
	public New_dash1(Expression expr) {
		this.expr = expr;
	}
	
	@Override
	public String getValue() {
		String res = "";
		res += "int";
		res += " [";
		res += expr.getValue();
		res += "] ";
				
		return res;
	}

}
