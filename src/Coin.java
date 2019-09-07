
public enum Coin {

	Quater(25), Dime(10), Nickel(5);

	public final int value;

	Coin(final int changevalue) {
		value = changevalue;
	}
	
	public int getValue() {
		return value;
	}

}
