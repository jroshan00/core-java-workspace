package implementingEnum.enumWithConstrutor;

public enum Day {
	    MONDAY("Weekday"),
	    SATURDAY("Weekend"),
	    SUNDAY("Weekend");

	    private String type;
	    
	    // Default Constructor
	    Day() {
	    	//super(); //Cannot invoke super constructor from enum constructor Day()
	    }
	    // Constructor
	    Day(String type) {
	        this.type = type;
	    }

	    // Getter method
	    public String getType() {
	        return type;
	    }

}
