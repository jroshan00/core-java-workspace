package inheritanceExamples;

public class Mango extends Fruits {
	int price;
	String variety;
	double weightInKg;
	//String season;
	
	Mango(){
		
	}
	Mango(Fruits p){
		super.season=p.season;
		super.importLocation=p.importLocation;
	}
	
	Mango(int price){
		this.price=price;
		System.out.println("The Mango(int price) constructer is called");
	}
	
	Mango(int price,String variety){
		System.out.println("The Mango(int price,String variety) constructer is called");
		this.price=price;
		this.variety=variety;
	}
	Mango(int price,String variety,String season){
		super(season);
		System.out.println("The Mango(int price,String variety,String season) constructer is called");
		this.price=price;
		this.variety=variety;
	}
	
	Mango(int price,String variety,String season,String importLocation){
		this(price,variety,season);
		System.out.println("The Mango(int price,String variety,String season,String importLocation) constructer is called");
		super.importLocation=importLocation;
	}
	Mango(int price,String variety,String season,String importLocation,double weightInkg){
		this(price,variety,season);
		System.out.println("The Mango(int price,String variety,String season,String importLocation,double weightInkg) constructer is called");
		this.weightInKg=weightInkg;
		super.importLocation=importLocation;
	}
	String getDetails() {
		return "\nFruit Weights in: "+this.weightInKg +"\nFruit variety is : "+this.variety +"\nFruit price is : "+this.price +"\nFruit is bought in: "+super.season + "\nand Imported from : " + super.importLocation;
	}
}
