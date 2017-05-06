package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type7 implements Type {

	@Override
	public String getValue() {

		String result = "";

		result += "float";

		result += "[";

		result += "] ";

		return result;
	}

}
