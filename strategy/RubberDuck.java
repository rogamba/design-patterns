public class RubberDuck extends Duck {

	public RubberDuck(){
		flyBehaviour = new FlySuperHigh();
		quackBehaviour = new QuackSqueak();
	}

	// This needs to be implemented cause of 
	// the abstract method in the parent class
	public void display() {
		System.out.println("Displaying Rubber Duck.")
	}
}