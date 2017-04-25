package grammar;

public class Unmatched_dash2 implements Unmatched_dash{
	Matched matched;
	Unmatched unmatched;
	public Unmatched_dash2(Matched matched,Unmatched unmatched) {
		this.matched = matched;
		this.unmatched = unmatched;
	}
	@Override
	public String getValue() {
		return matched.getValue()+" else "+unmatched.getValue();
	}
}
