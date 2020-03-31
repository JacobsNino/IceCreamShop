package be.intecbrussel.eatables;

public class Cone{
	public enum Flavor {
		STRAWBERRY,BANANA,CHOCOLATE,VANILLA,LEMON,STRACIATELLA,MOKKA,PISTACHE;
	}

	public Flavor[] balls;
	
	
	public Cone() {
		
	}

	public Cone(Flavor[] balls) {
		this.balls = balls;
	}
	
	public void eat() {
		System.out.println(this.balls);
	}
	
	
	
}
