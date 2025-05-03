package hero;

public class MagicShield implements IShield {

	private IShield innerShield;
	private ILuckCalculator luck;
	
	public MagicShield(IShield innerShield, ILuckCalculator luck) {
		this.innerShield= innerShield;
		this.luck = luck;
	}


	public double defend(double opponentStrength) {
		//pe scurt eu ca MagicShield ce stiu?
		
		//pe scurt eu ca SHILED CE STIU? CUM MA APAR?
		/*
		 * pai vine atacatoru si el zice ca ar trb sa primesc atata damage
		 * eu aici in (inner)shield stiu ca am un anumit defense
		 * The damage done by the attacker is calculated with the following formula:
             Damage = Attacker strength – Defender defense
		 *  deci da. practic eu returnez opponentDamage - defense.
		 *  
		 *  
		 *  ACUM. ce fac in magic Shield?
		 *  Magic shield: Takes only half of the usual damage when an enemy attacks; there’s a 20%
            chance he’ll use this skill every time he defends
            
            eu cum o gandesc? zic ca damagetaken e gen cat face innerShieldu
            dar eu daca sunt lucky o sa returnez damageTaken / 2.
		 *  
		 */
		
		double damageTaken = innerShield.defend(opponentStrength);
		
		if( luck.isLucky())
		{
			return damageTaken / 2; 
			//if i am lucky with the MagicShield i only take 50% of the normal damage
		}
		else return damageTaken;
	}

}
