public abstract class Pizza {

    String name;

    // From pizza ingredient factory
    Cheese cheese;
    Sauce sauce;

    // Where we'll collect ingredients
    public abstract void prepare();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void bake(){
        System.out.println("Baking pizza");
    }
    public void cut(){
        System.out.println("Cutting pizza");
    }
    public void box(){
        System.out.println("Putting pizza inside the box");
    }
}