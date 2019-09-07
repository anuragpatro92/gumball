import java.util.List;

public class Inspector {

	public final Integer rateOfGumBall;
	Integer sum;
	Integer returnValue;

	Inspector(Integer rate) {
		this.rateOfGumBall = rate;
	}

	public Boolean areCoinsEnough(List<Coin> coins) {

		Integer sum = 0;
		for (int i = 0; i < coins.size(); i++) {

			sum = sum + coins.get(i).getValue();

		}

		if (sum >= this.rateOfGumBall) {
			this.returnValue = sum - this.rateOfGumBall;
			return true;
		} else {
			return false;
		}

	}

}
