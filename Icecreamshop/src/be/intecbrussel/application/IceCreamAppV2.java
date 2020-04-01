package be.intecbrussel.application;
import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {

	public static void main(String[] args) throws NoMoreIceCreamException {
		
		PriceList list1 = new PriceList(15,10,12);
		Stock stock = new Stock();
		stock.setBalls(10);
		stock.setCones(10);
		stock.setIceRockets(10);
		stock.setMagni(10);
		
		IceCreamCar Car= new IceCreamCar(list1,stock);
		
		
		Flavor[] flavors = {Flavor.BANANA,Flavor.CHOCOLATE,Flavor.LEMON}; //new Flavor[3];
		
		try {
			for(int i = 0; i < 12; i++) {
				Car.orderMagnum(MagnumType.MILKCHOCOLATE);
			}
		} catch(NoMoreIceCreamException ex) {
			System.err.print(ex.getMessage());
		}
		
		
		try {
			for(int i = 0; i < 12; i++) {
				Car.orderIceRocket();
			}
		} catch(NoMoreIceCreamException ex) {
			System.err.print(ex.getMessage());
		}
		
		
		
		
		
		
		
		
		

	}

}
