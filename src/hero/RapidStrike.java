package hero;

public class RapidStrike implements ISword {

	private ISword innerSword;
	private ILuckCalculator luck;
	
	public RapidStrike(ISword innerSword, ILuckCalculator luck) {
		this.innerSword = innerSword;
		this.luck = luck;
	}


	public void attack(IFighter opponent) {
		innerSword.attack(opponent);
		if( luck.isLucky())
		{
			System.out.println("Another attack from the Rapid Strike!");
			innerSword.attack(opponent);
		}
	}

}
