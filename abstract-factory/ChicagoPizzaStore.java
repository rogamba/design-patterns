public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        // Factory Method
        if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style veggie pizza");
        } 
        return pizza;
    }
}