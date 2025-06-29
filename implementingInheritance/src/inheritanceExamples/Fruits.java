package inheritanceExamples;

public class Fruits {
	String season;
	String importLocation;
	
	Fruits(){
		super();
		System.out.println("The Fruit() constructer is called");
		
	}
	
	Fruits(String season){
		//this();
		System.out.println("The Fruit(String season) constructer is called");
		this.season=season;

	}
	
	Fruits(String season,String importLocation){
		this(season);
		System.out.println("The Fruit(String season,String importLocation) constructer is called");
		this.importLocation=importLocation;

	}
	
	String getDetails() {
		return "\nFruit is bought in: "+season + " and Imported from : " + importLocation;
	}

	

}
