public class ExtraMilk extends ExtrasDecorator{
    Beverage beverage;

    ExtraMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return this.beverage.getDescription() + " + Milk";
    }

    public double cost() {
        return this.beverage.cost()+0.5;
    }
}