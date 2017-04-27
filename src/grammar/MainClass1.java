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
<<<<<<< HEAD
	public String getValue() {
		return "class" + identifier1.getValue() + "{" + "public" + "static" + "void" + "main" + "(" + "String" + "[" + "]" + identifier2.getValue() + ")" + "{" + statement.getValue() + "}" + "}";
=======
	public String getValue(Queue<Lexeme> q) {
		String result = "";
		
		if(q.peek().value.equals("class")){
			q.poll();
			result += "class";
			result += identifier1.getValue(q);
			if(q.peek().value.equals("{")){
				q.poll();
				result += "{";
				if(q.peek().value.equals("public")){
					q.poll();
					result += "public";
					if(q.peek().value.equals("static")){
						q.poll();
						result += "static";
						if(q.peek().value.equals("void")){
							q.poll();
							result += "void";
							if(q.peek().value.equals("main")){
								q.poll();
								result += "main";
								if(q.peek().value.equals("(")){
									q.poll();
									result += "(";
									if(q.peek().value.equals("String")){
										q.poll();
										result += "String";
										if(q.peek().value.equals("[")){
											q.poll();
											result += "[";
											if(q.peek().value.equals("]")){
												q.poll();
												result += "]";
												result += identifier2.getValue(q);
												if(q.peek().value.equals(")")){
													q.poll();
													result += ")";
													if(q.peek().value.equals("{")){
														q.poll();
														result += "{";
														result += statement.getValue(q);
														if(q.peek().value.equals("}")){
															q.poll();
															result += "}";
															if(q.peek().value.equals("}")){
																q.poll();
																result += "}";
																result += getValue(q);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	 return result;
>>>>>>> e12e0b1779cb8c63c94990a97533aa13a2a60a96
	}
	
}
