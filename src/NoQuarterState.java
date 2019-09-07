import java.util.List;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;
	
	

	

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	private Boolean validateCoin(Coin coin) {
		if (gumballMachine.Types.contains(coin)) {
			return true;
		} else {
			return false;
		}
	}

	public void insertQuarter(Coin coin) {
		System.out.println("You inserted a coin");

		if (validateCoin(coin)) {

			gumballMachine.setCurrentValue(coin.getValue() + gumballMachine.getCurrentValue());
			

			if (gumballMachine.getCurrentValue() == gumballMachine.getRateOfGumball()) {
				System.out.println(" turn the crank ......");
				gumballMachine.setState(gumballMachine.getHasQuarterState());

			} else if (gumballMachine.getCurrentValue() > gumballMachine.getRateOfGumball()) {
				int diff = gumballMachine.getCurrentValue() - gumballMachine.getRateOfGumball();
				gumballMachine.setState(gumballMachine.getHasQuarterState());

				System.out.println("returning balance amount" + diff);
			} else {
				System.out.println("Insert more coins");

			}
		}
		else {
			System.out.println("Invalid Coins");
		}

	}

	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}

	public String toString() {
		return "waiting for quarter";
	}

}
