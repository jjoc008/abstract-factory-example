package furniture.factories;

import furniture.chairs.Chair;
import furniture.cofeetables.CoffeTable;
import furniture.sofas.Sofa;

public interface FurnitureFactory {

	Chair createChair();
	Sofa createSofa();
	CoffeTable createCoffeTable();
}
