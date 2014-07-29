
public class RetiredEmployee extends Employee {

	private Double pension;

	public RetiredEmployee(String name, Double pension) {
		super(name);
		this.pension = pension;
	}

	public Double getPension() {
		return pension;
	}

	public void setPension(Double pension) {
		this.pension = pension;
	}

}
