package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Expression_dash3 implements Expression_dash {

	Dot_dash dotDash;
	
	public Expression_dash3(Dot_dash dotDash) {
		this.dotDash = dotDash;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		String res = "";
		if(q.peek().value.equals(".")){
			res += q.poll().value;
			res += dotDash.getValue(q);
		}
		return res;

	}

}
