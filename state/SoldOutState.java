/**
 * This state represents the Gumball Machine
 * when there is no more gumballs
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void ejectQuarter() {
        System.out.println("Nothing to do");
    }
    public void turnCrank() {
        System.out.println("Nothing to do");
    }
    public void insertQuarter() {
        System.out.println("Nothing to do");
    }
    public void dispense() {
        System.out.println("Nothing to do");
    }
    
}