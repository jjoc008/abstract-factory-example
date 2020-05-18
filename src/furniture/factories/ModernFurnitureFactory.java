package furniture.factories;

import furniture.chairs.Chair;
import furniture.chairs.ModernChair;
import furniture.cofeetables.CoffeTable;
import furniture.cofeetables.ModernCoffeTable;
import furniture.sofas.ModerSofa;
import furniture.sofas.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		return new ModernChair();
	}

	@Override
	public Sofa createSofa() {
		return new ModerSofa();
	}

	@Override
	public CoffeTable createCoffeTable() {
		return new ModernCoffeTable();
	}
}
