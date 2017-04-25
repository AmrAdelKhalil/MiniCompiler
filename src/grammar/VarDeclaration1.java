package grammar;

public class VarDeclaration1 implements VarDeclaration{
	
	Type type;
	Identifier identifier;
	
	public VarDeclaration1(Type type, Identifier identifier){
		this.type = type;
		this.identifier = identifier;
	}

	@Override
	public String getValue() {
		return type.getValue() + identifier.getValue() + ";";
	}
	
	
}
