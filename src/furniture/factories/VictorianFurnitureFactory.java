package furniture.factories;

import furniture.chairs.Chair;
import furniture.chairs.VictorianChair;
import furniture.cofeetables.CoffeTable;
import furniture.cofeetables.VictorianCoffeTable;
import furniture.sofas.Sofa;
import furniture.sofas.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new VictorianChair();
	}

	@Override
	public Sofa createSofa() {
		return new VictorianSofa();
	}

	@Override
	public CoffeTable createCoffeTable() {
		return new VictorianCoffeTable();
	}
}
