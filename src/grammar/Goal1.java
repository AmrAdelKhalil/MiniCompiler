package grammar;

import java.util.ArrayList;


public class Goal1 implements Goal{
	
	MainClass mainClass;
	ArrayList<ClassDeclaration1> classDeclarations;
	
	public Goal1(MainClass mainClass, ArrayList<ClassDeclaration1> classDeclarations){
		this.mainClass = mainClass;
		this.classDeclarations = classDeclarations;
	}
	
	@Override
	public String getValue() {
		
		String result = "";
		
	    result = mainClass.getValue();
	    for(int i= 0;i<classDeclarations.size();i++)
	    	result+= classDeclarations.get(i).getValue();
	    
	    return result;
	    
	}
}
