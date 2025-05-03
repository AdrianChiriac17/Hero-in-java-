package hero;

public class LuckCalculator implements ILuckCalculator {
	
	private double luck;
	
	public LuckCalculator(double luck) {
		this.luck=luck;
	}
	
	//this is only for Orderus' RapidStrike and MagicShield
	@Override
	public boolean isLucky()
	{
		double rand = Math.random()* 100;
		
		return rand >= luck;
	}

	@Override
	public boolean isLuckier(ILuckCalculator otherLuck) {
		return otherLuck.isUnluckier(this.luck);
	}

	@Override
	public boolean isUnluckier(double otherLuck) {
		if(this.luck < otherLuck)
			return true;
		else 
			return false;
	}
	
	
}
