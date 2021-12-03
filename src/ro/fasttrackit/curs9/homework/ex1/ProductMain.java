package ro.fasttrackit.curs9.homework.ex1;

public class ProductMain {
    public static void main(String[] args) {

        Product product = new Product(100,"Radio","Stereo",10);
        Cosmetics cosmetics = new Cosmetics("Head",5,"red", 5);
        Electronics electronics = new Electronics("video",25.10,15.10,6.3,1.5);
        Fridge fridge =new Fridge(11);

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
