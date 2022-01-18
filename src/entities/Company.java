package entities;

public class Company extends TaxPayer{

	private Double healthExpeditures;
	
	public Company() {
	}

	public Company(String name, Double anuallcome, Double healthExpeditures) {
		super(name, anuallcome);
		this.healthExpeditures = healthExpeditures;
	}

	public Double getHealthExpeditures() {
		return healthExpeditures;
	}

	public void setHealthExpeditures(Double healthExpeditures) {
		this.healthExpeditures = healthExpeditures;
	}
}