import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		

		

		List<Coin> coins = new ArrayList<Coin>();
		
		//coins.add(Coin.Dime);
		coins.add(Coin.Quater);
		coins.add(Coin.Nickel);
		coins.add(Coin.Dime);
		GumballMachine gumballMachine = new GumballMachine(4,50,coins);
		
		gumballMachine.insertQuarter(Coin.Quater);
		gumballMachine.insertQuarter(Coin.Dime);
		gumballMachine.insertQuarter(Coin.Dime);
		gumballMachine.insertQuarter(Coin.Nickel);
		
		gumballMachine.turnCrank();
		gumballMachine.releaseBall();
		
		gumballMachine.insertQuarter(Coin.Quater);
		gumballMachine.insertQuarter(Coin.Dime);
		gumballMachine.insertQuarter(Coin.Dime);
		gumballMachine.insertQuarter(Coin.Nickel);
		
		gumballMachine.turnCrank();
		gumballMachine.releaseBall();
		//gumballMachine.turnCrank();
		
		//GumballMachine gumballMachine = new GumballMachine()

		
		//System.out.println(gumballMachine);

		
		
		
		
		
		
		
	

		//System.out.println(gumballMachine);
	}
}
