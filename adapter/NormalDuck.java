/**
 * Concrete implementation of Duck
 */
public class NormalDuck implements Duck {
    public void fly() {
        System.out.println("Normal duck flying...");
    }

    public void quack() {
        System.out.println("Quack quack!");
    }
}