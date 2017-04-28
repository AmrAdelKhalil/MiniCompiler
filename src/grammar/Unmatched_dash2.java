package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Unmatched_dash2 implements Unmatched_dash{
	Matched matched;
	Unmatched unmatched;
	public Unmatched_dash2(Matched matched,Unmatched unmatched) {
		this.matched = matched;
		this.unmatched = unmatched;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "";
		result += matched.getValue(q);
		if(q.peek().value.equals("else"))
		{
			result += q.poll().value;
			result += unmatched.getValue(q);
		}
		return result;
	}
}
