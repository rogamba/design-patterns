public class Business implements Observer {

	private String currentVariable;
	private Integer businessId;

	Business(Integer businessId) {
		this.businessId = businessId;
	}

	public void update(String variable) {
		this.currentVariable = variable;
		refresh();
	}

	public void refresh() {
		System.out.println("["+this.businessId+"] Refreshing display : "+this.currentVariable);
	}
}