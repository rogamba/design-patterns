/**
 * This class deals with Iterators
 * instead of dealing with the collections type
 * of every menu, for example array, array list,
 * linked list, etc...
 */
public class MenuPrinter {

    DinnerMenu dinnerMenu;
    MorningMenu morningMenu;

    public MenuPrinter(DinnerMenu dinnerMenu, MorningMenu morningMenu){
        this.dinnerMenu = dinnerMenu;
        this.morningMenu = morningMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> dinnerMenuIterator = dinnerMenu.createIterator();
        Iterator<MenuItem> morningMenuIterator = morningMenu.createIterator();
        printMenu(dinnerMenuIterator);
        printMenu(morningMenuIterator);
    }

    public void printMenu(Iterator<MenuItem> menuIterator){
        while (menuIterator.hasNext()){
            MenuItem item = menuIterator.next();
            System.out.println(item.getName());
        }
    }
    
}