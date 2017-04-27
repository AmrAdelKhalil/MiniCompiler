package grammar;

public class final_5 implements Final_ {

	Identifier id;
	
	public final_5(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return id.getValue();
	}

}
