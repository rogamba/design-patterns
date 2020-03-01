public abstract class Duck {
	
	public String name;
	public FlyBehaviour flyBehaviour;
	public QuackBehaviour quackBehaviour;

	public Duck(){
	}

	public void setFlyBehaviour(FlyBehaviour fb) {
		flyBehaviour = fb;
	}

	public void setQuackBehaviour(QuackBehaviour qb) {
		quackBehaviour = qb;
	}

	public void display() {
		String.out.println("Default duck display;");
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

}