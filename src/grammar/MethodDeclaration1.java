package grammar;

public class MethodDeclaration1 implements MethodDeclaration{
	
	Type type1, type2;
	Identifier identifier1, identifier2;
	VarDeclaration varDeclaration1;
	Statement statement;
	Expression expression;
	
	public MethodDeclaration1(Type type1, Type type2, Identifier identifier1, Identifier identifier2, VarDeclaration varDeclaration, Statment statment, Expression expression) {
		this.type1 = type1;
		this.type2 = type2;
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
		this.varDeclaration1 = varDeclaration;
		this.statement = statment;
		this.expression = expression;
	}
	
	@Override
	public String getValue() {
		//there is an if condition on public or private, 2rg3 lel grammer
		return "(public | private)" + type1.getValue() + identifier1.getValue() + "(" + type2.getValue() + identifier2.getValue() + ")" + "{"  varDeclaration1.getValue() + statement.getValue() + "return" + expression.getValue() + ";" + "}";
	}

}
