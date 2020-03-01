public class MenuItem {

    String name;
    double price;
    boolean vegetarian;

    public MenuItem(String name, double price, boolean vegetarian){
        this.name = name;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }
}