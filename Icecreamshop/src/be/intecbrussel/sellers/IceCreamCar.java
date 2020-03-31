package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller{
	public PriceList pricelist;
	public Stock stock;
	public double profit;

	public IceCreamCar(PriceList pricelist, Stock stock) {
		this.pricelist = pricelist;
		this.stock = stock;
		
	}
	@Override
	public Cone orderCone(Flavor[] balls) {
		// TODO Auto-generated method stub
		return null;
	}
	private Cone prepareCone(Flavor[] balls) {
		return null;
	}
	
	@Override
	public IceRocket orderIceRocket() {
		// TODO Auto-generated method stub
		return null;
	}
	private IceRocket prepareRocket() {
		return null;
	}

	@Override
	public Magnum orderMagnum(MagnumType MagnumChoice) {
		// TODO Auto-generated method stub
		return null;
	}
	private Magnum prepareMagnum(MagnumType Magnum) {
		return null;
	}
	public double getProfit() {
		return this.profit;
	}

}
