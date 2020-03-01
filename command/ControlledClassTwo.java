public class ControlledClassTwo {
    public String name;
    ControlledClassTwo(String name){
        this.name = name;
    }

    public void setOnState(){
        System.out.println("Performing CC2 setOnState routine...");
    }

    public void setOffState(){
        System.out.println("Performing CC2 setOffState routine...");
    }
}