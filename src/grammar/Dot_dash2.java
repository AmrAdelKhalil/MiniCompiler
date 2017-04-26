package grammar;

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
	public String getValue() {
		// TODO Auto-generated method stub
		return id.getValue() + "(" + ( expr1.getValue() + ( "," + expr2.getValue() )+ "*" ) + "?"+  ")";
		//need to handle
	}

}
