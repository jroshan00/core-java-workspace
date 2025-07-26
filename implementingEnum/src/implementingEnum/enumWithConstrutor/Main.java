package implementingEnum.enumWithConstrutor;

public class Main {
	public static void main(String[] args) {
		for (Day day : Day.values()) {
			System.out.println(day + " is a " + day.getType());
		}
	}
	
	/*
	 * MONDAY is a Weekdas
	 * SATURDAY is a Weekend
	 * SUNDAY is a Weekend
	 * 
	 */

}
