import java.util.ArrayList;

public class MorningMenu {
    
    Integer MAX_ITEMS = 5;
    Integer numItems = 0;
    private MenuItem[] menuItems;
    
    public MorningMenu(){
        // Construct the menu
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Morning Chicken Sandwich", 10.3, false);
        addItem("Morning Quinoa Salad", 5.99, true);
        addItem("Morning Salmon salad", 4.00, false);
    }

    public void addItem(String name, double price, boolean vegetarian) {
        MenuItem item = new MenuItem(name, price, vegetarian);
        if (numItems >= MAX_ITEMS){
            System.err.println("Max num of items reached.");
        } else {
            menuItems[numItems] = item;
            numItems = numItems+1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator(){
        return new MorningMenuIterator(menuItems);
    }
}