public class ChicagoPizzaStore extends PizzaStore {
    // This is the factory method that decides the instance of the pizza
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("veggie")){
            pizza = new ChicagoVeggiePizza();
        }else if(type.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        }
        return pizza;
    }
}