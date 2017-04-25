package grammar;

public class If_statment2 implements If_statement{
	Unmatched unmatched;
	
	public If_statment2(Unmatched unmatched){
		this.unmatched = unmatched;
	}
	
	@Override
	public String getValue() {
		return unmatched.getValue();
	}

}
