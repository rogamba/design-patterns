public class Driver {
    public static void main(String[] args){
        // NY Style pizza
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    
        System.out.println();
        // Chicago style pizza
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
    }
}