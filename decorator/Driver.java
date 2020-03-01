public class Driver {
    public static void main(String[] args) {
        // Create new beverage and decorate with extras
        Beverage beverage = new Espresso();
        beverage = new ExtraShot(beverage);
        beverage = new ExtraMilk(beverage);
        System.out.println(beverage.getDescription());
        System.out.println("Costs: " + beverage.cost());
    }
}