package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class New_dash2 implements New_dash {

	Identifier id;
	
	public New_dash2(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String getValue() {
		String res = "";
		res += id.getValue();
			
		res += "(";
				
		res += ")";
				
		return res;
	}

}
