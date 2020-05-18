package furniture.factories;

import furniture.chairs.ArtDecoChair;
import furniture.chairs.Chair;
import furniture.cofeetables.ArtDecoCoffeTable;
import furniture.cofeetables.CoffeTable;
import furniture.sofas.ArtDecoSofa;
import furniture.sofas.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		return new ArtDecoChair();
	}

	@Override
	public Sofa createSofa() {
		return new ArtDecoSofa();
	}

	@Override
	public CoffeTable createCoffeTable() {
		return new ArtDecoCoffeTable();
	}
}
