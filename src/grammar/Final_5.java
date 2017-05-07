package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Final_5 implements Final_ {

	Identifier id;
	
	public Final_5(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String getValue() {
		
		return id.getValue();
	}

}
