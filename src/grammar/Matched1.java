package grammar;

public class Matched1 implements Matched{
	Expression expression ;
	Matched left,right;
	public Matched1(Expression expression,Matched left,Matched right){
		this.expression = expression;
		this.left = left;
		this.right = right;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "if("+expression.getValue()+")"+left.getValue()+"else"+right.getValue();
	}
	
}
