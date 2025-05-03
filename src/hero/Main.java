package hero;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//aici codul de lupta.
		
		IFighter orderus1 = Builder.orderusBuilder("orderus");
		IFighter beast1 = Builder.beastBuilder("beast");
		IFighter randomZombie = Builder.zombieBuilder("zombie", -100);
		
		Clash randomClash = new Clash(orderus1, randomZombie);
		
		randomClash.fight();
		
		return;
	}

}
