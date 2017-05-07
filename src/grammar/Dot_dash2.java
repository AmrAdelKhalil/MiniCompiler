package grammar;


import java.util.ArrayList;
import java.util.Queue;

import Tokenizing.Lexeme;

public class Dot_dash2 implements Dot_dash {
	
	Identifier id;
	Expression expr1;
	ArrayList<Expression> expr2;
	
	public Dot_dash2(Identifier id, Expression expr1, ArrayList<Expression> expr2) {
		this.id = id;
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	@Override

	public String getValue() {
		String res = "";
		res += id.getValue()+"(";
		res += expr1.getValue();
		for (int i=0;i<expr2.size();i++)
			res +=", " + expr2.get(i).getValue();
		res += ")";
		return res;

	}

}
