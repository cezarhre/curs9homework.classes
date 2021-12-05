package ro.fasttrackit.curs9.homework.ex1;

public class ProductMain {
    public static void main(String[] args) {

        Product product = new Product(100,"Radio","Stereo",10);
        Cosmetics cosmetics = new Cosmetics("Head",50,"Grease",10,"red", 250);
        Electronics electronics = new Electronics(100,"Sony","video",20,"HD",
                25.10,15.10,6.3,1.5);
        Fridge fridge =new Fridge(150,"Refrigerator","2 doors",15,7.5,
                "Frozen",75.25,25.2,250.3,54.2);

        System.out.println(cosmetics.getColour());
        System.out.println(cosmetics.toString());
        System.out.println(product.getName());
        System.out.println(electronics.getType());
        System.out.println(electronics.setLength(8.5));
        System.out.println(electronics.toString());
        System.out.println(fridge.setTemperature());
        System.out.println((fridge.toString()));

    }
}
