import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class NewsPaper implements Subject {

	private ArrayList<Observer> observers;
	private String broadcastVariable;

	NewsPaper() {
		this.observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}	

	public void removeObserver(Observer o) {
		Integer i = this.observers.indexOf(o);
		if (i >= 0){
			this.observers.remove(0);
		}
	}

	public void notifyObservers(String variable) {
		for(int i=0; i<observers.size(); i++){
			this.observers.get(i).update(variable);
		}
	}

	public void setBroadcastVariable(String value) {
		this.broadcastVariable = value;
	}

	public String getBroadcastVariable() {
		return this.broadcastVariable;
	}

	public static void main(String[] args) throws InterruptedException{
		// Instance of the concrete subject (this guy)
		NewsPaper news = new NewsPaper();
		// Register the observers
		news.registerObserver(new Business(1));
		news.registerObserver(new Business(2));
		news.registerObserver(new Business(3));
		// Broadcast a change
		for(int i=0; i<=10; i++) {
			news.setBroadcastVariable("[ "+i+" ]");
			news.notifyObservers(news.getBroadcastVariable());
			TimeUnit.SECONDS.sleep(1);
		}
	}
}