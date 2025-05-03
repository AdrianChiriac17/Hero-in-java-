package hero;

public interface IHpCalculator {

	void updateHp(double damageTaken);

	boolean isEntityDead();

	double getHp();

}