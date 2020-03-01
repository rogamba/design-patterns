public class ControlledClassOne {
    public String name;
    ControlledClassOne(String name){
        this.name = name;
    }

    public void on(){
        System.out.println("Performing CC1 on routine...");
    }

    public void off(){
        System.out.println("Performing CC1 off routine...");
    }
}