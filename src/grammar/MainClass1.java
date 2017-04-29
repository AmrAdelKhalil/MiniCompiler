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
	public String getValue(Queue<Lexeme> q) {
		String result = "";
		
			result += "class";
			result += identifier1.getValue(q);
				result += "{";
					result += "public";
						result += "static";
							result += "void";
								result += "main";
									result += "(";
										result += "String";
											result += "[";
												result += "]";
												result += identifier2.getValue(q);
													result += ")";
														result += "{";
														result += statement.getValue(q);
															result += "}";
																result += "}";
	 return result;
	}
	
}
