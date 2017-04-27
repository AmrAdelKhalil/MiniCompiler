package grammar;

public class New_dash2 implements New_dash {

	Identifier id;
	
	public New_dash2(Identifier id) {
		this.id = id;
	}
	
	@Override
	public String getValue() {
		return "new" + id.getValue() + "(" + ")";
	}

}
