package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Expression_dash3 implements Expression_dash {

	Dot_dash dotDash;
	
	public Expression_dash3(Dot_dash dotDash) {
		this.dotDash = dotDash;
	}
	
	@Override
	public String getValue() {
		String res = ".";
		
		res += dotDash.getValue();
		
		return res;

	}

}
