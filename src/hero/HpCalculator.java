package hero;

public class HpCalculator implements IHpCalculator {
	
	private double hp;
	private double minimumHealth;
	
	public HpCalculator(double hp, double minimumHealth) {
		this.hp = hp;
		this.minimumHealth = minimumHealth;
	}

	
	@Override
	public void updateHp(double damageTaken)
	{
		hp -= damageTaken;
	}
	
	@Override
	public boolean isEntityDead() {
		return hp<=minimumHealth;
	}

	
	@Override
	public double getHp() {
		return hp;
	}
    
	
}
