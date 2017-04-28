package grammar;

public class ClassDeclaration1 implements ClassDeclaration{

	Identifier identifier1;
	Identifier identifier2;
	VarDeclaration varDeclaration;
	MethodDeclaration methodDeclaration;
	
	public ClassDeclaration1(Identifier identifier1, Identifier identifier2, VarDeclaration varDeclaration, MethodDeclaration methodDeclaration){
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
		this.varDeclaration = varDeclaration;
		this.methodDeclaration = methodDeclaration;
	}
	
	@Override
	public String getValue() {
		//feh condition 3la extends mn 2wel ( l7d ??
		return "class" + identifier1.getValue() + "(" + "extends" + identifier2.getValue() + ")?" + "{" + "(" + varDeclaration.getValue() + ") " + "(" + methodDeclaration.getValue() + ") " + "}";
	}

}
