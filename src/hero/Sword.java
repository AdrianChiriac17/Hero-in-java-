package hero;

public class Sword implements ISword{

	private double strength;
	
	public Sword(double strength)
	{
		this.strength=strength;
	}

	@Override
	public void attack(IFighter opponent)
	{
		opponent.defend(strength);
		return;
	}

}
