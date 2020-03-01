/**
 * This state represents the Gumball Machine
 * right after someone inserts a coin.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void ejectQuarter() {
        System.out.println("Ejecting quarter... changing state >");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("Turning crank.. changing state >");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    /**
     * Actions that do not change state
     */
    public void insertQuarter() {
        System.out.println("You can't turn insert quarter");
    }
    public void dispense() {
        System.out.println("You can't dispense");
    }
    
}