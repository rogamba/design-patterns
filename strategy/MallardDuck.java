public class MallardDuck extends Duck {

	public MallardDuck(){
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new QuackRealDuck();
	}

	// This needs to be implemented cause of 
	// the abstract method in the parent class
	public void display() {
		System.out.println("Hi, I'm a Mallard Duck.")
	}

}