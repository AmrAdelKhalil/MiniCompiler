package grammar;

public class Goal1 implements Goal{
	
	MainClass mainClass;
	ClassDeclaration classDeclaration;
	
	public Goal1(MainClass mainClass, ClassDeclaration classDeclaration){
		this.mainClass = mainClass;
		this.classDeclaration = classDeclaration;
	}
	
	@Override
	public String getValue() {
		return mainClass.getValue() +  "(" + classDeclaration.getValue() + ")* <EOF" ;
	}

}
