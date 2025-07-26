package implementingEnum.enumWithFieldsAndMethods;

public class Main {
	public static void main(String[] args) {
		double earthMass=Planet.EARTCH.getMass();
		double jupiterMass=Planet.JUPITER.getMass();
		double marsMass=Planet.MARS.getMass();
		System.out.println("Mass of Earth is : "+earthMass+" * 10^24 kg");
		System.out.println("Mass of Earth is : "+jupiterMass+" * 10^24 kg");
		System.out.println("Mass of Earth is : "+marsMass+" * 10^24 kg");
	}

}
