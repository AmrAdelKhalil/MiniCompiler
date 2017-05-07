package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Unmatched1 implements Unmatched {
	Expression expression;
	Unmatched_dash unmatched_dash;

	public Unmatched1(Expression expression, Unmatched_dash unmatched_dash) {
		this.expression = expression;
		this.unmatched_dash = unmatched_dash;
	}

	@Override
	public String getValue() {
		String result = "";
		result = "if";

		result += " (";
		result += expression.getValue();

		result += ") ";
		result += unmatched_dash.getValue();

		return result;
	}

}
