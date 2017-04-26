package grammar;

public class Expression_double_dash1 implements Expression_double_dash {

	Expression_double_dash EDD;
	Expression_dash ED;
	
	public Expression_double_dash1(Expression_double_dash EDD, Expression_dash ED) {
		this.EDD = EDD;
		this.ED = ED;
	}
	
	@Override
	public String getValue() {
		
		return ED.getValue() + EDD.getValue();
	}

}
