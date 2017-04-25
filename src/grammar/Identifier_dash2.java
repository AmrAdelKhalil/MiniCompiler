package grammar;

import java.beans.Expression;

public class Identifier_dash2 implements Identifier_dash{
	Expression left,right;
	public Identifier_dash1(Expression left,Expression right){
		this.left = left;
		this.right = right;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "[" + left.getValue()+"]="+right.getValue()+";";
	}

}
