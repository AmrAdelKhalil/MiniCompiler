package grammar;

import java.util.Queue;

import Tokenizing.Lexeme;

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
		String result = "";
		
			result += "class ";
			result += identifier1.getValue();
				result += " {\n";
					result += "\tpublic ";
						result += "static ";
							result += "void ";
								result += "main ";
									result += "(";
										result += "String";
											result += "[";
												result += "] ";
												result += identifier2.getValue();
													result += ")";
														result += " {\n";
														result += "\t" + statement.getValue();
															result += "\t}";
																result += "\n}";
	 return result;
	}
	
}
