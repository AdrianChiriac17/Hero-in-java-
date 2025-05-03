package hero;

public class Fighter implements IFighter {

	private double speed;
	private String name;
	private ISword sword;
	private IShield shield;
	private IHpCalculator hpCalculator;
	private ILuckCalculator luckCalculator;

	public Fighter(String name, double speed, ISword sword, IShield shield, IHpCalculator hpCalculator,
			ILuckCalculator luckCalculator) {
		this.name = name;
		this.speed = speed;

		this.sword = sword;
		this.shield = shield;
		this.hpCalculator = hpCalculator;
		this.luckCalculator = luckCalculator;
	}

	@Override
	public void attack(IFighter opponent) {
		sword.attack(opponent);
		return;
	}

	@Override
	public void defend(double opponentStrength) {
		if (luckCalculator.isLucky()) {
			System.out.print(this.name + "'s ");
			hpCalculator.updateHp(0);
			return; //attacker misses the attack
		}
		System.out.println(
				"Despite being attacked by the opponent's " + String.format("%.2f", opponentStrength) + " strength...");

		double damageTaken = shield.defend(opponentStrength);

		System.out.println(this.name + " has taken " + String.format("%.2f", damageTaken) + " damage");

		System.out.print(this.name + "'s ");
		hpCalculator.updateHp(damageTaken);
		return;
	}

	// logic for who starts the fight with overloaded methods
	@Override
	public boolean isStrikingFirst(IFighter opponent) {
		return opponent.isStrikingFirst(this.speed, this.luckCalculator);
	}

	@Override
	public boolean isStrikingFirst(double otherSpeed, ILuckCalculator otherLuck) {
		if (this.speed == otherSpeed) {
			if (this.luckCalculator.isLuckier(otherLuck))
				return true;
			else
				return false;
		} else if (this.speed > otherSpeed)
			return true;
		else
			return false;
	}

	@Override
	public boolean isDead() {
		return hpCalculator.isEntityDead();
	}

	@Override
	public double getHp() {
		return hpCalculator.getHp();
	}

}
