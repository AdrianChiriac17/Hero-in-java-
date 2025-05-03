package hero;

public class Builder {

	public Builder() {
		// TODO Auto-generated constructor stub
	}
	
	
	static IFighter orderusBuilder(String name)
	{
		double rand;
		
		System.out.println("For " + name);
		
		//calculate random hp for the hpCalculator
		rand = 70 + Math.random()*30;  //between 70 and 100
		IHpCalculator hpCalculator = new HpCalculator(rand,0);
		System.out.println("HP=" + String.format("%.2f", rand));
		
		
		//calculate random luck for the LuckCalculator
		rand = 10 + Math.random()*20; //between 10 and 30
		ILuckCalculator luckCalculator = new LuckCalculator(rand);
		System.out.println("Luck=" + String.format("%.2f", rand));
		
		//calculate random strength for the Sword(in orderus' case innerSword)
		rand = 70 + Math.random()*10; //between 70 and 80
		ISword innerSword = new Sword(rand);
		ISword rapidStrike = new RapidStrike(innerSword,luckCalculator);
		System.out.println("Strength=" + String.format("%.2f", rand));
		
		//calculate random defense for the Shield
		rand= 45 + Math.random()*10; //between 45 and 55
		IShield innerShield = new Shield(rand);
		IShield magicShield = new MagicShield(innerShield, luckCalculator);
		System.out.println("Defense=" + String.format("%.2f", rand));
		
		//calculate random speed for the hero
		double speed = 40 + Math.random()*10; //between 40 and 50
		System.out.println("speed=" + String.format("%.2f", speed) + "\n");
		
		IFighter orderus = new Fighter(name, speed, rapidStrike, magicShield, hpCalculator, luckCalculator);
		
		return orderus;
	}
	
	static IFighter beastBuilder(String name)
	{
		double rand;
		
		System.out.println("For " + name);
		
		//calculate random hp for the hpCalculator
		rand = 60 + Math.random()*30;  //between 60 and 90
		IHpCalculator hpCalculator = new HpCalculator(rand,0);
		System.out.println("HP=" + String.format("%.2f", rand));
		
		//calculate random luck for the LuckCalculator
		rand = 25 + Math.random()*15; //between 25 and 40
		ILuckCalculator luckCalculator = new LuckCalculator(rand);
		System.out.println("Luck=" + String.format("%.2f", rand));
		
		//calculate random strength for the Sword
		rand = 60 + Math.random()*30; //between 60 and 90
		ISword sword = new Sword(rand);
		System.out.println("Strength=" + String.format("%.2f", rand));
		
		//calculate random defense for the Shield
		rand= 40 + Math.random()*20; //between 40 and 60
		IShield shield = new Shield(rand);
		System.out.println("Defense=" + String.format("%.2f", rand));
		
		//calculate random speed for the hero
		double speed = 40 + Math.random()*20; //between 40 and 60
		System.out.println("speed=" + String.format("%.2f", speed) + "\n");
		
		IFighter beast = new Fighter(name, speed, sword, shield, hpCalculator, luckCalculator);
		
		return beast;
	}
	
	static IFighter zombieBuilder(String name, double minimumHealth)
	{
		double rand;
		
		System.out.println("For " + name);
		
		//calculate random hp for the hpCalculator
		rand = 70 + Math.random()*30;  //between 70 and 100
		IHpCalculator hpCalculator = new HpCalculator(rand,minimumHealth);
		System.out.println("HP=" + String.format("%.2f", rand));
		
		
		//calculate random luck for the LuckCalculator
		rand = 10 + Math.random()*20; //between 10 and 30
		ILuckCalculator luckCalculator = new LuckCalculator(rand);
		System.out.println("Luck=" + String.format("%.2f", rand));
		
		//calculate random strength for the Sword(in orderus' case innerSword)
		rand = 70 + Math.random()*10; //between 70 and 80
		ISword innerSword = new Sword(rand);
		ISword rapidStrike = new RapidStrike(innerSword,luckCalculator);
		System.out.println("Strength=" + String.format("%.2f", rand));
		
		//calculate random defense for the Shield
		rand= 45 + Math.random()*10; //between 45 and 55
		IShield innerShield = new Shield(rand);
		IShield magicShield = new MagicShield(innerShield, luckCalculator);
		System.out.println("Defense=" + String.format("%.2f", rand));
		
		//calculate random speed for the hero
		double speed = 40 + Math.random()*10; //between 40 and 50
		System.out.println("speed=" + String.format("%.2f", speed) + "\n");
		
		IFighter orderus = new Fighter(name, speed, rapidStrike, magicShield, hpCalculator, luckCalculator);
		
		return orderus;
	}
	
}
