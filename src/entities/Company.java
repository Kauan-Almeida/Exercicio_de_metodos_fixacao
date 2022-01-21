package entities;

public class Company extends TaxPayer {

	private int numberOfEmployees;

	public Company() {
	}

	public Company(String name, Double anuallcome, int numberOfEmployees) {
		super(name, anuallcome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	double sum = 0;
	public Double Tax() {
		 
		if( numberOfEmployees > 10) {
			sum += getAnuallncome() *14/100;
		}
		else {
			 sum += getAnuallncome() *16/100;
		}
		return sum;
	}	}