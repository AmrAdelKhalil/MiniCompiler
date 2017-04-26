package grammar;

public class Expression1 implements Expression {

	Final_ F;
	Expression_double_dash EDD; 
	
	public Expression1(Final_ F, Expression_double_dash EDD) {
		this.F = F;
		this.EDD = EDD;
	}
	
	@Override
	public String getValue() {
		
		return F.getValue() + EDD.getValue();
	}

}
