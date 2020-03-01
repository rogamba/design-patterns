public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    VeggiePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("Preparing "+ name);
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }
}