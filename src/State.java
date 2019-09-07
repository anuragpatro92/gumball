import java.util.List;

public interface State {
 
	
	public void insertQuarter(Coin coin);
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
