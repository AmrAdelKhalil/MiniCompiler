package grammar;

public class MainClass1 implements MainClass{
	
	Identifier identifier1;
	Identifier identifier2;
	Statement statement;
	
	public MainClass1(Identifier identifier1, Identifier identifier2, Statement statement){
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
		this.statement = statement;
	}

	@Override
	public String getValue() {
		return "class" + identifier1.getValue() + "{" + "public" + "static" + "void" + "main" + "(" + "String" + "[" + "]" + identifier2.getValue() + ")" + "{" + statement.getValue() + "}" + "}";
	}
	
}
