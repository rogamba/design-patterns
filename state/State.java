/**
 * Each class of State must implement their own
 * reponses for the actions.
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}