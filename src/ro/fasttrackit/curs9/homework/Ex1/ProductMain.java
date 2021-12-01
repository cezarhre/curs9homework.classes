package ro.fasttrackit.curs9.homework.Ex1;

public class ProductMain {
    public static void main(String[] args) {

        Product product = new Product(100,"Radio","Stereo",10);
        Cosmetics cosmetics = new Cosmetics("red", 5);
        Electronics electronics = new Electronics();
        Fridge fridge =new Fridge(11);

        System.out.println(cosmetics.getColour());
        System.out.println(product.getName());
        System.out.println(electronics.getType());
        System.out.println(electronics.setLength(8.5));
        System.out.println(fridge.setTemperature());

    }
}
