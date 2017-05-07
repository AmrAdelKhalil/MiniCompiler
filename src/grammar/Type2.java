package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Type2 implements Type{

	@Override
	public String getValue() {
		String result = "";
		
		result += "boolean ";
		return result;
	}

}
