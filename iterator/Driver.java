public class Driver {
    public static void main(String[] args) {
        DinnerMenu dinnerMenu = new DinnerMenu();
        MorningMenu morningMenu = new MorningMenu();
        MenuPrinter menuPrinter = new MenuPrinter(dinnerMenu, morningMenu);
        menuPrinter.printMenu();
    }
}