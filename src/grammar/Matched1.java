package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

public class Matched1 implements Matched{
	Expression expression ;
	Matched left,right;
	public Matched1(Expression expression,Matched left,Matched right){
		this.expression = expression;
		this.left = left;
		this.right = right;
	}
	@Override
	public String getValue(Queue<Lexeme>q) {
		String result = "if";
		result += "(";
		result += expression.getValue(q);
		
		result += ")";
		result += left.getValue(q);
		
		result += "else";
		result += right.getValue(q);
		
		return result;
	}
	
}
