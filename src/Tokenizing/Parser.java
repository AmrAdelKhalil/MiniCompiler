package Tokenizing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import grammar.*;

public class Parser {
	Queue<Lexeme> Tokens = new LinkedList<Lexeme>();

	Parser(Queue<Lexeme> q) {
		this.Tokens = q;
	}

	public Goal1 goal1() {
		MainClass1 mainClass = mainClass();
		ClassDeclaration1 classdeclaration = classdeclaration();
		//System.out.println(classdeclaration);
		return new Goal1(mainClass, classdeclaration);
	}

	public MainClass1 mainClass() {
		if (Tokens.peek().value.equals("class")) {
			Tokens.poll();
			Identifier identefier1 = identefier();
			if (Tokens.peek().value.equals("{")) {
				Tokens.poll();
				if (Tokens.peek().value.equals("public")) {
					Tokens.poll();
					if (Tokens.peek().value.equals("static")) {
						Tokens.poll();
						if (Tokens.peek().value.equals("void")) {
							Tokens.poll();
							if (Tokens.peek().value.equals("main")) {
								Tokens.poll();
								if (Tokens.peek().value.equals("(")) {
									Tokens.poll();
									if (Tokens.peek().value.equals("String")) {
										Tokens.poll();
										if (Tokens.peek().value.equals("[")) {
											Tokens.poll();
											if (Tokens.peek().value.equals("]")) {
												Tokens.poll();
												Identifier identefier2 = identefier();
												if (Tokens.peek().value.equals(")")) {
													Tokens.poll();
													if (Tokens.peek().value.equals("{")) {
														Tokens.poll();
														Statement statement = statement();
															if (Tokens.peek().value.equals("}")) {
															Tokens.poll();
															if (Tokens.peek().value.equals("}")) {
																Tokens.poll();
																return new MainClass1(identefier1, identefier2,
																		statement);
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
		return null;
	}

	public ClassDeclaration1 classdeclaration() {
		if (Tokens.peek().value.equals("class")) {
			Tokens.poll();
			Identifier identefier1 = identefier();

			Identifier identefier2 = null;
			// handle null in class declration
			if (Tokens.peek().value.equals("extends")) {
				Tokens.poll();
				identefier2 = identefier();

			}
			if (Tokens.peek().value.equals("{")) {
				Tokens.poll();

				ArrayList<VarDeclaration1> varDeclaration1 = new ArrayList<VarDeclaration1>();
				VarDeclaration1 varDeclerationElement = varDeclaration1();
				while (varDeclerationElement != null) {
					varDeclaration1.add(varDeclerationElement);
					varDeclerationElement = varDeclaration1();
				}
				
				ArrayList<MethodDeclaration1> methodDeclaration1 = new ArrayList<MethodDeclaration1>();
				MethodDeclaration1 methodDeclarationElement = methodDeclaration1();
				//System.out.println(Tokens.peek().value +"   jj ");
				while (methodDeclarationElement != null) {
					methodDeclaration1.add(methodDeclarationElement);
					methodDeclarationElement = methodDeclaration1();
				//	System.out.println(methodDeclarationElement);
				}
				//System.out.println(methodDeclaration1.size());
				
				if (Tokens.peek().value.equals("}")) {
					Tokens.poll();
				//	System.out.println(varDeclaration1.size()+" "+methodDeclaration1.get(0).getValue(Tokens));
					return new ClassDeclaration1(identefier1, identefier2, varDeclaration1, methodDeclaration1);
				}
			}
		}
		return null;
	}

	public Identifier identefier() {
	//	System.out.println(Tokens.peek().index+" "+Tokens.peek().value +" "+Tokens.peek().token +" id");
		if (!Tokens.peek().token.equals("ID"))
			return null;
		return new Identifier1(Tokens.poll().value);
	}

	public Statement statement() {
		// handle all cases
		if (Tokens.peek().value.equals("{")) {
			Tokens.poll();
			Statement statement = statement();
			if (Tokens.peek().value.equals("}")) {
				Tokens.poll();
				return new Statement1(statement);
			}
		}

		else if (Tokens.peek().value.equals("while")) {
			Tokens.poll();
			if (Tokens.peek().value.equals("(")) {
				Tokens.poll();

				Expression expression = expression();
				if (Tokens.peek().value.equals(")")) {
					Tokens.poll();
					Statement statement = statement();
					return new Statement3(expression, statement);
				}
			}
		}
		if (Tokens.peek().value.equals("System.out.println")) {
			Tokens.poll();
			

			if (Tokens.peek().value.equals("(")) {
				Tokens.poll();

				Expression expression = expression();

				if (Tokens.peek().value.equals(")")) {
					Tokens.poll();

					if (Tokens.peek().value.equals(";")) {
						Tokens.poll();
						return new Statement4(expression);
					}
				}
			}
		} else {
			Identifier identefier1 = identefier();
			if (identefier1 != null) {
				Identifier_dash identifier_dash = identifier_dash();
				return new Statement5(identefier1, identifier_dash);
			}
			if(Tokens.peek().token.equals("IF_CONDITION")){
			If_statement if_statement = if_statement();
			if (if_statement != null)
				return new Statement2(if_statement);
			}
		}
		return null;
	}

	public If_statement if_statement() {
		Expression expression = matchedAndUnMatched();
			Matched matched = matched(expression);
			System.out.println("maatced" +" "+Tokens.peek().value+" "+matched);
			if (matched == null) {
				
				Unmatched unmatched = unmatched(expression);
				return new If_statment2(unmatched);
			}
			return new If_statment1(matched);
	}

	public Unmatched unmatched(Expression expression) {
		System.out.println("unmaatced" +" "+Tokens.peek().value);
		Unmatched_dash unmatched_dash = unmatched_dash();
		
		if (unmatched_dash != null)
			return new Unmatched1(expression, unmatched_dash);
		return null;
	}

	public Unmatched_dash unmatched_dash() {
		System.out.println(Tokens.peek().value+" 8");
		Statement statement = statement();
		if (statement != null)
			return new Unmatched_dash1(statement);
		Expression expression1 = matchedAndUnMatched();
		Matched matched = matched(expression1);
		if (matched != null) {
			
			if (Tokens.peek().value.equals("else")) {
				Tokens.poll();
				Expression expression2 = matchedAndUnMatched();
				Unmatched unmatched = unmatched(expression2);
				
				if (unmatched != null) {
					
					return new Unmatched_dash2(matched, unmatched);
				}
			}
		}
		return null;
	}

	public Expression matchedAndUnMatched() {
		if (Tokens.peek().value.equals("if")) {
			Tokens.poll();
			if (Tokens.peek().value.equals("(")) {
				Tokens.poll();
				Expression expression = expression();
				if (Tokens.peek().value.equals(")")) {
					Tokens.poll();
					return expression;
				}
			}
		}
		return null;
	}

	public Matched matched(Expression expression) {
		Expression expression1 = matchedAndUnMatched();
		if (expression != null) {
			Matched matched1 = matched(expression1);
			if(matched1 !=null)
			{
				if (Tokens.peek().value.equals("else")) {
					Tokens.poll();
					Expression expression2 = matchedAndUnMatched();
				//	System.out.println(expression2 +" "+Tokens.peek().value+ " amora");
					Matched matched2 = matched(expression2);
					if (matched2 != null) {
						
						return new Matched1(expression, matched1, matched2);
					}
	
				}
			}
		}
		Statement statement = statement();
		if(statement != null)
			return new Matched2(statement);
		return null;
	}

	public Identifier_dash identifier_dash() {
		if (Tokens.peek().value.equals("=")) {
			Tokens.poll();
			Expression expression1 = expression();
			if (expression1 != null) {
				if (Tokens.peek().value.equals(";")) {
					Tokens.poll();
					return new Identifier_dash1(expression1);
				}
			}

		} else if (Tokens.peek().value.equals("[")) {
			Tokens.poll();
			Expression expression2 = expression();
			if (expression2 != null) {
				if (Tokens.peek().value.equals("]")) {
					Tokens.poll();
					if (Tokens.peek().value.equals("=")) {
						Tokens.poll();
						Expression expression3 = expression();
						if (expression3 != null) {
							if (Tokens.peek().value.equals(";")) {
								Tokens.poll();
								return new Identifier_dash2(expression2, expression3);
							}
						}
					}
				}
			}

		}
		return null;
	}

	public VarDeclaration1 varDeclaration1() {
		// zero or more
		Type type = type();

		if (type != null) {
			Identifier identefier = identefier();
			if (identefier != null) {
				if (Tokens.peek().value.equals(";")) {
					Tokens.poll();
					return new VarDeclaration1(type, identefier);
				}
			}
		}
		return null;
	}

	public MethodDeclaration1 methodDeclaration1() {
		// zero or more
		String token = "";
		if (Tokens.peek().value.equals("public") || Tokens.peek().value.equals("private")) {
			token = Tokens.poll().value;
			Type type = type();
			Identifier identefier = identefier();
		//	System.out.println(identefier.getValue(Tokens));
			ArrayList<Type> types = new ArrayList<>();
			ArrayList<Identifier> identifiers = new ArrayList<>();
			types.add(type);
			identifiers.add(identefier);
			if (Tokens.peek().value.equals("(")) {
				Tokens.poll();
				Type type1 = null;
				Identifier identifier1 = null;

				if (!Tokens.peek().value.equals(")")) {

					type1 = type();
					identifier1 = identefier();
					types.add(type1);
					identifiers.add(identifier1);
					multiParams(types, identifiers);
				//	System.out.println(types.size()+" "+identifiers.size());
				}
			//	System.out.println(Tokens.peek().value);
				if (Tokens.peek().value.equals(")")) {
					Tokens.poll();
					if (Tokens.peek().value.equals("{")) {
						Tokens.poll();
						ArrayList<VarDeclaration1> varDeclaration1 = new ArrayList<VarDeclaration1>();
						VarDeclaration1 varDeclerationElement = varDeclaration1();
						while (varDeclerationElement != null) {
							varDeclaration1.add(varDeclerationElement);
							varDeclerationElement = varDeclaration1();
						}
						ArrayList<Statement> statement1 = new ArrayList<Statement>();
						Statement statementElement = statement();
						//System.out.println(statementElement.getValue(Tokens)+ " "+Tokens.peek().value);
						while (statementElement != null) {
							statement1.add(statementElement);
							statementElement = statement();
							//System.out.println(statementElement);
						}
						if (Tokens.peek().value.equals("return")) {
							Tokens.poll();
							Expression expression = expression();
							if (Tokens.peek().value.equals(";")) {
								Tokens.poll();
								if (Tokens.peek().value.equals("}")) {
									Tokens.poll();
									return new MethodDeclaration1(token, types, identifiers, varDeclaration1,
											statement1, expression);
								}
							}

						}
					}
				}
			}

		}
		return null;
	}

	public void multiParams(ArrayList<Type> types, ArrayList<Identifier> identifiers) {

		if (Tokens.peek().value.equals(",")) {
			Tokens.poll();
			Type type = type();
			Identifier identifier = identefier();
			types.add(type);
			identifiers.add(identifier);
			multiParams(types, identifiers);
		}
	}

	public Type type() {
		// handle all types
		if (Tokens.peek().value.equals("int")) {
			Tokens.poll();
			return int_dash();
		} else if (Tokens.peek().value.equals("boolean")) {
			Tokens.poll();
			return boolean_dash();
		} else if (Tokens.peek().value.equals("float")) {
			Tokens.poll();
			return float_dash();
		} else if (Tokens.peek().value.equals("String")) {
			Tokens.poll();
			return String_dash();
		} else if (Tokens.peek().value.equals("char")) {
			Tokens.poll();
			return char_dash();
		}
		return null;
	}

	public Type char_dash() {
		if (Tokens.peek().value.equals("[")) {
			Tokens.poll();
			if (Tokens.peek().value.equals("]")) {
				Tokens.poll();
				return new Type9();
			}
		}
		return new Type6();
	}

	public Type String_dash() {
		if (Tokens.peek().value.equals("[")) {
			Tokens.poll();
			if (Tokens.peek().value.equals("]")) {
				Tokens.poll();
				return new Type8();
			}
		}
		return new Type5();
	}

	public Type float_dash() {
		if (Tokens.peek().value.equals("[")) {
			Tokens.poll();
			if (Tokens.peek().value.equals("]")) {
				Tokens.poll();
				return new Type7();
			}
		}
		return new Type4();
	}

	public Type int_dash() {
		if (Tokens.peek().value.equals("[")) {
			Tokens.poll();
			if (Tokens.peek().value.equals("]")) {
				Tokens.poll();
				return new Type1();
			}
		}
		return new Type3();
	}

	public Type boolean_dash() {
		if (Tokens.peek().value.equals("[")) {
			Tokens.poll();
			if (Tokens.peek().value.equals("]")) {
				Tokens.poll();
				return new Type10();
			}
		}
		return new Type2();
	}

	public Expression expression() {
		Final_ final_ = final_();

		if (final_ != null) {
			Expression_double_dash expression_double_dash = expression_double_dash();
			if (expression_double_dash != null) {
				return new Expression1(final_, expression_double_dash);
			}
		}
		if (Tokens.peek().value.equals("!")) {
			Tokens.poll();
			Expression expression1 = expression();
			if (expression1 != null) {
				Expression_double_dash expression_double_dash = expression_double_dash();
				if (expression_double_dash != null) {
					return new Expression2(expression1, expression_double_dash);
				}
			}
		}

		if (Tokens.peek().value.equals("(")) {
			Tokens.poll();
			Expression expression1 = expression();
			if (expression1 != null) {
				Expression_double_dash expression_double_dash = expression_double_dash();
				if (expression_double_dash != null) {
					if (Tokens.peek().value.equals(")")) {
						Tokens.poll();
						return new Expression3(expression1, expression_double_dash);
					}
				}
			}
		}
		return null;
	}

	public Final_ final_() {
		if (Tokens.peek().token.equals("INTEGRAL_LITERAL"))
			return new Final_1(Tokens.poll().value);
		if (Tokens.peek().value.equals("true")){
			Tokens.poll();
			return new Final_2();}
		if (Tokens.peek().value.equals("false")){
			Tokens.poll();
			return new Final_3();}
		if (Tokens.peek().value.equals("this")){
			Tokens.poll();
			return new Final_4();}
		Identifier identifier = identefier();
		if (identifier != null)
			return new Final_5(identifier);
		if (Tokens.peek().value.equals("new")) {
			Tokens.poll();
			New_dash new_dash = new_dash();
			return new Final_6(new_dash);
		}

		return null;
	}

	public New_dash new_dash() {
		if (Tokens.peek().value.equals("int")) {
			Tokens.poll();
			if (Tokens.peek().value.equals("[")) {
				Tokens.poll();
				Expression expression = expression();
				if (expression != null) {
					if (Tokens.peek().value.equals("]")) {
						Tokens.poll();
						return new New_dash1(expression);
					}
				}
			}
		}

		Identifier identifier = identefier();
		if (identifier != null) {
			if (Tokens.peek().value.equals("(")) {
				Tokens.poll();
				if (Tokens.peek().value.equals(")")) {
					Tokens.poll();
					return new New_dash2(identifier);
				}
			}
		}

		return null;
	}

	public Expression_double_dash expression_double_dash() {
		Expression_dash expression_dash = expression_dash();
		if (expression_dash != null) {
			Expression_double_dash expression_double_dash = expression_double_dash();
			if (expression_double_dash != null) {
				return new Expression_double_dash1(expression_double_dash, expression_dash);
			}
		}
		return new Expression_double_dash2();
	}

	public Expression_dash expression_dash() {
		if (Tokens.peek().value.equals("&&") || Tokens.peek().value.equals("<") || Tokens.peek().value.equals("+")
				|| Tokens.peek().value.equals("-") || Tokens.peek().value.equals("*")) {
			String Token = Tokens.poll().value;
			Expression expression1 = expression();
			if (expression1 != null) {
				return new Expression_dash1(Token, expression1);
			}
		}
		if (Tokens.peek().value.equals("[")) {
			Tokens.poll();
			Expression expression1 = expression();
			if (expression1 != null) {
				if (Tokens.peek().value.equals("]")) {
					Tokens.poll();
					return new Expression_dash2(expression1);
				}
			}
		}
		if (Tokens.peek().value.equals(".")) {
			Tokens.poll();
			Dot_dash dot_dash = dot_dash();
			return new Expression_dash3(dot_dash);
		}
		return null;
	}

	public Dot_dash dot_dash() {
		if (Tokens.peek().value.equals("length")) {
			Tokens.poll();
			return new Dot_dash1();

		}
		Identifier identifier = identefier();
		if (identifier != null) {
			ArrayList<Expression> expressions = new ArrayList<>();
			Expression expression = null;
			if (Tokens.peek().value.equals("(")) {
				Tokens.poll();
				expression = expression();
				if (expression != null) {
					multiparams(expressions);
				}

			}
			if (Tokens.peek().value.equals(")")) {
				Tokens.poll();
				return new Dot_dash2(identifier, expression, expressions);
			}
		}
		return null;
	}

	public void multiparams(ArrayList<Expression> expressions) {
		if (Tokens.peek().value.equals(",")) {
			Tokens.poll();
			Expression expression = expression();
			if (expression != null) {
				expressions.add(expression);
				multiparams(expressions);
			}
		}
	}
	// dot_dash , Expression_dash , Identifier
}
