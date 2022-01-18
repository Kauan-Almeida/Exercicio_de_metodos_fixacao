package entities;

public class Individual extends TaxPayer{

	private int numberOfEmployees;
	
	public Individual() {
	}

	public Individual(String name, Double anuallcome, int numberOfEmployees) {
		super(name, anuallcome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
}
