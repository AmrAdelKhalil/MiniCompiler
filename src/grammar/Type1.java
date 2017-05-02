package grammar;


import java.util.Queue;

import Tokenizing.Lexeme;

public class Type1 implements Type {

	@Override
	public String getValue() {
		
		String result = "";
		
		result += "int";
			
		result += "[";
	
		result += "] ";
				
		return result;

	}
	
}
