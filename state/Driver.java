public class Driver {
    public static void main(String[] args) {
        // Start the machine with 5 gumballs
        GumballMachine gumballMachine = new GumballMachine(5);
        
        // Normal Flow...
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

    }
}