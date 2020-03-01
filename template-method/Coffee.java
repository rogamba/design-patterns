public class Coffee extends HotBeverage {

    boolean condimentPreference = true;

    public void brew() {
        System.out.println("Brewing coffee");
    }

    public void addCondiment() {
        System.out.println("Adding milk and sugar.");
    }

    public boolean customerWantsCondiment(){
        if (condimentPreference) {
            return true;
        } else {
            return false;
        }
    }
}