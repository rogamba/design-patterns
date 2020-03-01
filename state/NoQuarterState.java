/**
 * This state represents the Gumball Machine
 * before someone inserts a coin.
 */
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter... changing state >");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    /**
     * Actions that do not change state
     */
    public void ejectQuarter() {
        System.out.println("You can't eject quarter");
    }
    public void turnCrank() {
        System.out.println("You can't turn crank");
    }
    public void dispense() {
        System.out.println("You can't dispense");
    }
    
}