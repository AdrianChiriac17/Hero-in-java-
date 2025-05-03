package hero;

public interface ILuckCalculator {

	//this is only for Orderus' RapidStrike and MagicShield
	boolean isLucky();

	boolean isLuckier(ILuckCalculator otherLuck);

	boolean isUnluckier(double otherLuck);

}