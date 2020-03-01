import java.util.Iterator;
/**
 * This class prints the menus and submenus,
 * uses the CompositeIterator class for the
 * traversal.
 */
public class MenuPrinter {

    MenuComponent allMenus;

    public MenuPrinter(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("VEGETARIAN MENU");
        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {}

        }
 
    }

    
}