package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class If_statment1 implements If_statement{
	Matched matched;
	
	public If_statment1(Matched matched){
		this.matched = matched;
	}
	
	@Override
	public String getValue() {
		return matched.getValue();
	}

}
