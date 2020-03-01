import java.util.ArrayList;

public class DinnerMenu {
    private ArrayList<MenuItem> menuItems;
    public DinnerMenu(){
        // Construct the menu
        menuItems = new ArrayList<MenuItem>();
        addItem("Chicken Sandwich", 10.3, false);
        addItem("Quinoa Salad", 5.99, true);
        addItem("Salmon salad", 4.00, false);
    }

    public void addItem(String name, double price, boolean vegetarian) {
        MenuItem item = new MenuItem(name, price, vegetarian);
        menuItems.add(item);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}