public abstract class HotBeverage {
    /**
     * This is the method that the subclasses
     * will use, some of the behaviour in here
     * change dependeing on the subclass.
     */
    final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiment()){
            addCondiment();
        }
    }

    /**
     * Some methods used in the prepareBeverage method
     * are implemented in the abstract class
     */
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring beverage in cup");
    }

    /**
     * Some methods must be implemented in
     * the child classes, but are used in the
     * prepareBeverage method
     */
    abstract void brew();

    abstract void addCondiment();

    /**
     * This is the Hook, the subclass can override this
     * method to add custom logic.
     */
    boolean customerWantsCondiment() {
        return true;
    }

}