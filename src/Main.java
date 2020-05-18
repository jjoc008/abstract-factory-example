import furniture.chairs.Chair;
import furniture.cofeetables.CoffeTable;
import furniture.factories.ArtDecoFurnitureFactory;
import furniture.factories.FurnitureFactory;
import furniture.factories.ModernFurnitureFactory;
import furniture.factories.VictorianFurnitureFactory;
import furniture.sofas.Sofa;

public class Main {

    public static void main(String[] args) {

        String furnitureKind = "ArtDeco";
        FurnitureFactory factory = null;

        if(furnitureKind.equals("Modern")){
            factory = new ModernFurnitureFactory();
        }else if ( furnitureKind.equals("Victorian")){
            factory = new VictorianFurnitureFactory();
        }else if (furnitureKind.equals("ArtDeco")){
            factory = new ArtDecoFurnitureFactory();
        }

        sellFurnitures(factory);

    }


    public static void sellFurnitures(FurnitureFactory factory){

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeTable coffeTable = factory.createCoffeTable();

        System.out.println(chair.showChair());
        System.out.println(sofa.showSofa());
        System.out.println(coffeTable.showCoffeTable());

    }
}
