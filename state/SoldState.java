/**
 * This state represents the Gumball Machine
 * after the crank is turned
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
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

    /**
     * Actions that do not change state
     */
    public void dispense() {
        System.out.println("Releasing ball... changing state >");
        gumballMachine.releaseBall();
        if(gumballMachine.count > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } 
    }
    
}