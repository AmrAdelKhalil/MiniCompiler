package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Expression_dash1 implements Expression_dash {
	
	Expression expr;
	String Token;
	public Expression_dash1(String Token , Expression expr) {
		this.expr = expr;
		this.Token = Token;
	}
	
	@Override
	public String getValue() {
		String res = " " + Token + " ";
		res += expr.getValue();
		
		return res;

	}

}
