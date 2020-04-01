package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone.Flavor;
import be.intecbrussel.eatables.Magnum.MagnumType;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
	public static void main(String[] args) {
		PriceList list1 = new PriceList(15,10,12);
		IceCreamSalon Salon = new IceCreamSalon(list1);
		
		Eatable[] eat = new Eatable[3];
		Flavor[] flavors = {Flavor.BANANA,Flavor.CHOCOLATE,Flavor.LEMON}; //new Flavor[3];
		
		eat[0] = Salon.orderIceRocket();
		eat[1] = Salon.orderCone(flavors);
		eat[2] = Salon.orderMagnum(MagnumType.MILKCHOCOLATE);
		
		for(int i = 0; i < eat.length;i++) {
			eat[i].eat();
		}
		System.out.println(Salon);
		
		

}
}