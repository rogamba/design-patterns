public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    // Chicago pizza factory uses reggiano cheese
    public Cheese createCheese(){ 
        return new CheeseReggiano();
    }
    // Chicago uses marinara sauce
    public Sauce createSauce(){
        return new SauceMarinara();
    }
}