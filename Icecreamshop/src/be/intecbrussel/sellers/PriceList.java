package be.intecbrussel.sellers;

public class PriceList {
	public double ballPrice;
	public double rocketPrice;
	public double magnumStandardPrice;
	
	public PriceList() {
		
	}
	public PriceList(double ballPrice,double rocketPrice,double magnumStandardPrice) {
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice = magnumStandardPrice;
	}
	
	public double getBallPrice() {
		return ballPrice;
	}
	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}
	public double getRocketPrice() {
		return rocketPrice;
	}
	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}
	public double getMagnumStandardPrice() {
		return magnumStandardPrice;
	}
	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}
	
	
	
}
