public class NYPizzaStore extends PizzaStore {
    // This is the factory method that decides the instance of the pizza
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("veggie")){
            pizza = new NYVeggiePizza();
        }else if(type.equals("cheese")) {
            pizza = new NYCheesePizza();
        }
        return pizza;
    }
}