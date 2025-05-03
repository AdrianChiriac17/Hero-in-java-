package hero;

public class Shield implements IShield{
	
	private double defense;
	
	public Shield(double defense) {
		// TODO Auto-generated constructor stub
		this.defense=defense;
		//hello github from pc
	}
	
	
	@Override
	public double defend(double opponentStrength) {
		
		/*
		 *  pai vine atacatoru si el zice ca eu ar trb sa primesc atata damage
		 * eu aici in (inner)shield stiu ca am un anumit defense
		 * The damage done by the attacker is calculated with the following formula:
             Damage = Attacker strength – Defender defense
		 *  deci da. practic eu returnez opponentDamage - defense.
		 */
		
		return Math.max(0, opponentStrength - this.defense ); //safety
	}
}
