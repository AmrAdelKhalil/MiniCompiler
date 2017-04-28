package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Final_1 implements Final_ {

	String integerLiteral;
	
	public Final_1(String integerLiteral) {
		this.integerLiteral = integerLiteral;
	}
	
	@Override
	public String getValue(Queue<Lexeme> q) {
		
		return integerLiteral;
	}

}
