package implementingEnum.enumWithFieldsAndMethods;

public enum Planet {
	EARTCH(5.97),
	MARS(4.27),
	JUPITER(1928);
	private double mass;
	private Planet(double mass) {
		this.mass=mass;
	}
	
	public double getMass() {
		return mass;
	}

}
