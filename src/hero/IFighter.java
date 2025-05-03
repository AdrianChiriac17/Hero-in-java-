package hero;

public interface IFighter {

	void attack(IFighter opponent);

	void defend(double opponentStrength);

	// logic for who starts the fight with overloaded methods
	boolean isStrikingFirst(IFighter opponent);

	boolean isStrikingFirst(double otherSpeed, ILuckCalculator otherLuck);

	boolean isDead();

	double getHp();

}