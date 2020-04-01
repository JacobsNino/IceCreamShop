package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamSalon implements IceCreamSeller{
	public  PriceList priceList;
	public double totalProfit;

	
	public IceCreamSalon(PriceList priceList) {
		this.priceList = priceList;
		
	}
	public double getProfit() {
		return this.totalProfit;
	}

	

	@Override
	public Cone orderCone(Flavor[] balls) {
		for(int i = 0; i < balls.length;i++) {
			totalProfit += priceList.getBallPrice();
		}
		return new Cone(balls);
	}
	@Override
	public IceRocket orderIceRocket() {
		totalProfit += priceList.getRocketPrice();
		return new IceRocket();
	}
	@Override
	public Magnum orderMagnum(MagnumType MagnumChoice) {
		totalProfit += priceList.getMagnumPrice(MagnumChoice);
		return new Magnum(MagnumChoice);
	}


	@Override
	public String toString() {
		return "IceCreamSalon [ totalProfit=" + totalProfit + "]";
	}	
	
}
