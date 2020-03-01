import java.util.*;

/**
 * For the Composite pattern, the Menu and MenuItem extend
 * the MenuComponent class, so they are treated as the same
 * type of object.
 */
public class MenuItem extends MenuComponent {

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

    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();

    public void print() {
        System.out.print("  " + getName());
        System.out.println("  " + getPrice());
    }
}