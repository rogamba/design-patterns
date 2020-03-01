public class ExtraShot extends ExtrasDecorator{
    Beverage beverage;

    ExtraShot(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return this.beverage.getDescription() + " + Shot";
    }

    public double cost() {
        return this.beverage.cost()+0.3;
    }
}