public class Driver {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        MenuPrinter menuPrinter = new MenuPrinter(dinnerMenu, morningMenu);
        menuPrinter.printMenu();
    }
}