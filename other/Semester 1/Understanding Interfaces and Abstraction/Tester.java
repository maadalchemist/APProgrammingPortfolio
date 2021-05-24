/**
    This program tests a Measurable Item class
*/
public class Tester {
    public static void main(String[] args) {
        Measurable movieSnack = new Item(8.95, 1.15);
        System.out.printf("Theater popcorn: %.2f%n", movieSnack.getMeasure());
        System.out.println("Expected: 7.80");

        Measurable cereal = new Item(5.95, 1.15);
        System.out.printf("Processed breakfast cereal: %.2f%n", cereal.getMeasure());
        System.out.println("Expected: 4.80");

        Measurable cosmetics = new Item(89.15, 7.35);
        System.out.printf("Designer cosmetics: %.2f%n", cosmetics.getMeasure());
        System.out.println("Expected: 81.80");

        Measurable prescription = new Item(9375.23, 7.35);
        System.out.printf("Brand-name prescription drug: %.2f%n", prescription.getMeasure());
        System.out.println("Expected: 9362.88");


        Measurable fred = new Employee(20000, 20100);
        System.out.printf("Fred's benefit costs: %.2f%n", fred.getMeasure());
        System.out.println("Expected: 100.00");

        Measurable velma = new Employee(15000, 20000);
        System.out.printf("Fred's benefit costs: %.2f%n", velma.getMeasure());
        System.out.println("Expected: 5000.00");

        Measurable daphne = new Employee(25000, 30000);
        System.out.printf("Fred's benefit costs: %.2f%n", daphne.getMeasure());
        System.out.println("Expected: 5000.00");

        Measurable shaggy = new Employee(100, 100);
        System.out.printf("Fred's benefit costs: %.2f%n", shaggy.getMeasure());
        System.out.println("Expected: 0.00");
    }
}
