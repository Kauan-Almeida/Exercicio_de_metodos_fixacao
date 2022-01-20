package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures ;
	
	public Individual() {
	}

	public Individual(String name, Double anuallcome, double healthExpenditures) {
		super(name, anuallcome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	@Override
	public Double Tax() {
		 
		if( getAnuallncome() > 20000.00) {
			healthExpenditures = (getAnuallncome() *25/100) - (healthExpenditures *50/100);
		}
		else if (getAnuallncome() < 20000.00){
			healthExpenditures = (getAnuallncome() *15/100) - (healthExpenditures *50/100);
		}
		return healthExpenditures;
	}	
}
