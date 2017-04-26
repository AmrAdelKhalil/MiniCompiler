package grammar;

public class Final_6 implements Final_{

	New_dash ND;
	
	public Final_6(New_dash ND) {
		this.ND = ND;
	}
	
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "new" + ND.getValue();
	}

}
