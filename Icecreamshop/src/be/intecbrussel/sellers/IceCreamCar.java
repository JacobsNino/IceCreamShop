package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.Magnum.MagnumType;

public class IceCreamCar implements IceCreamSeller {
	public PriceList pricelist;
	public Stock stock;
	public double profit;

	public IceCreamCar(PriceList pricelist, Stock stock) {
		this.pricelist = pricelist;
		this.stock = stock;

	}

	@Override
	public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException {
		
//		profit += pricelist.getBallPrice() * balls.length;
		return this.prepareCone(balls);
	}
	

	private Cone prepareCone(Flavor[] balls) throws NoMoreIceCreamException {
		if(stock.getCones() > 0) {
			if(stock.getBalls() > balls.length) {
				profit += pricelist.getBallPrice() * balls.length;
				stock.setCones(stock.getCones() - 1 );
				stock.setBalls(stock.getBalls() - balls.length);
			return new Cone(balls);
			}else {
				throw new NoMoreIceCreamException("no more Balls");
			}
				
		}else {
			throw new NoMoreIceCreamException("no more Cones");
	}
	}
	

	@Override
	public IceRocket orderIceRocket() throws NoMoreIceCreamException {
		return this.prepareRocket();
	}

	private IceRocket prepareRocket() throws NoMoreIceCreamException {
		if (stock.getIceRockets() > 0) {
			profit += pricelist.getRocketPrice();
			stock.setIceRockets(stock.getIceRockets() -1);
			return new IceRocket();
		} else {
			throw new NoMoreIceCreamException("no more IceRockets");
		}
	}

	@Override
	public Magnum orderMagnum(MagnumType MagnumChoice) throws NoMoreIceCreamException {
		return this.prepareMagnum(MagnumChoice);

	}

	private Magnum prepareMagnum(MagnumType Magnum) throws NoMoreIceCreamException {
		if (stock.getMagni() > 0) {
			 profit += pricelist.getMagnumPrice(Magnum);
			 stock.setMagni(stock.getMagni() -1);
			return new Magnum(Magnum);
			
		} else {
			throw new NoMoreIceCreamException("no more Magnums");

		}
	}

	public double getProfit() {
		return this.profit;
	}

}
