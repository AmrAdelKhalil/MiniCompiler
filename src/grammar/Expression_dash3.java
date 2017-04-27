package grammar;

public class Expression_dash3 implements Expression_dash {

	Dot_dash dotDash;
	
	public Expression_dash3(Dot_dash dotDash) {
		this.dotDash = dotDash;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "." + dotDash.getValue();
	}

}
