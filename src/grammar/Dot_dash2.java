package grammar;


import java.util.Queue;

import Tokenizing.Lexeme;

public class Dot_dash2 implements Dot_dash {
	
	Identifier id;
	Expression expr1;
	Expression expr2;
	
	public Dot_dash2(Identifier id, Expression expr1, Expression expr2) {
		this.id = id;
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	@Override

	public String getValue(Queue<Lexeme> q) {
		String res = "";
		res += id.getValue(q);
		if(q.peek().value.equals("(")){
			res += q.poll().value;
			if(q.peek().value.equals(")")){
				res += q.poll().value;
			}else{
				res += expr1.getValue(q);
				if(q.peek().value.equals(",")){
					res += q.poll().value;
					res += expr2.getValue(q);
					
				}
			}
		}
		return res;

	}

}
