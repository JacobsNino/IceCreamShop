package be.intecbrussel.eatables;

public class Magnum {
	public enum MagnumType {
		MILKCHOCOLATE,WHITECHOCOLATE,BLACKCHOCOLATE,ALPINENUTS,ROMANTICSSTRAWBERRIES;
	}
	
	public MagnumType MagnumType;
	
	
	public Magnum() {
		
	}
	public Magnum(MagnumType MagnumType) {
		this.MagnumType = MagnumType;
	}
	
	public void eat() {
		System.out.println(this.MagnumType);
		
	}
	public MagnumType getType() {
		return this.MagnumType;
	}

}
