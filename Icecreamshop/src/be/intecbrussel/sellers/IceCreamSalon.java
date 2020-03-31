package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamSalon implements IceCreamSeller {
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
		// TODO make a new cone and return it and with the pricelist the value of totalprice will go up
		return null;
	}
	@Override
	public IceRocket orderIceRocket() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Magnum orderMagnum(MagnumType MagnumChoice) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return "IceCreamSalon [priceList=" + priceList + ", totalProfit=" + totalProfit + "]";
	}	
	
}
