package hero;

public class Clash {
	
	public int roundNumber;
	private IFighter attacker;
	private IFighter defender;
	
	public Clash(IFighter fighter1, IFighter fighter2) {
		attacker=fighter1;
		defender=fighter2;
		//assumption that will or will not be changed later
		
		roundNumber=0;
	}
	
	private void whoStrikesFirst()
	{
		if( !attacker.isStrikingFirst(defender))
			swapRoles();
	}
	
	private void swapRoles() {
		IFighter temp = attacker;
		attacker = defender;
		defender = temp;
	}

	public void fight()
	{
		whoStrikesFirst();
		
		while( !isFightOver())
		{
			round();
			roundNumber++;
		}
		
		announceWinner();
		return;
	}
	
	private void announceWinner()
	{
		if(roundNumber>20)
		{
			System.out.println("Fight is over due to it being over 20 rounds... and the health levels are:");
			System.out.println(String.format("%.2f", attacker.getHp()) + " and " + String.format("%.2f", defender.getHp()));
		}
		else if(attacker.getHp() > 0)
		{
			System.out.println("Player 1 has won with " + String.format("%.2f", attacker.getHp()) + " HP remaining.");
		}
		else
		{
			System.out.println("Player 2 has won with " + String.format("%.2f", defender.getHp()) + " HP remaining.");
		}
			
	}

	private void round()
	{
		attacker.attack(defender);
		swapRoles();
	}
	
	private boolean isFightOver()
	{
		if(roundNumber>20)
			return true;
		else if(attacker.isDead() || defender.isDead())
			return true;
		else return false;
	}

}
