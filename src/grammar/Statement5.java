package grammar;

public class Statement5 implements Statement {
	Identifier  identifier;
	Identifier_dash identifier_dash;
	
	public Statement5(Identifier  identifier,Identifier_dash identifier_dash){
		this.identifier = identifier;
		this.identifier_dash = identifier_dash;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return identifier.getValue() + identifier_dash.getValue();
	}
	

}
