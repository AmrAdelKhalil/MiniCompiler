package grammar;

import java.util.ArrayList;
import java.util.Queue;

import Tokenizing.Lexeme;


public class ClassDeclaration1 implements ClassDeclaration{

	Identifier identifier1;
	Identifier identifier2;
	ArrayList<VarDeclaration1> varDeclaration;
	ArrayList<MethodDeclaration1> methodDeclaration;
	
	public ClassDeclaration1(Identifier identifier1, Identifier identifier2, ArrayList<VarDeclaration1> varDeclaration, ArrayList<MethodDeclaration1> methodDeclaration){
		this.identifier1 = identifier1;
		this.identifier2 = identifier2;
		this.varDeclaration = varDeclaration;
		this.methodDeclaration = methodDeclaration;
	}
	
	@Override
	public String getValue() {
		
		String result = "";
		
			result += "\nclass ";
			result += identifier1.getValue();
				if(identifier2 != null){
				result += " extends ";
				result += identifier2.getValue();
				}
				result += " {\n";
				
				for (int i = 0 ; i < varDeclaration.size() ; i++){
					result += "\t" + varDeclaration.get(i).getValue();
				}
				for (int i = 0 ; i < methodDeclaration.size() ; i++){
					result += "\t" + methodDeclaration.get(i).getValue();
				}
				
					result += "\n}";
		
		return result;

	}

}
