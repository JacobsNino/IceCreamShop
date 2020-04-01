package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum.MagnumType;

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
	public double getMagnumPrice(MagnumType type) {
		if(type == MagnumType.ALPINENUTS|| type == MagnumType.ROMANTICSSTRAWBERRIES) {
			return magnumStandardPrice * 1.5;
		}else {
		return magnumStandardPrice;
	}
	}
	
	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}
	
	
	
	
}
