package loan;

public class Main{

	public static void main(String[] args) {
		
		System.out.println("\n-------------------MAIN START----------------------------\n");
		
		Loan l1=new Loan("Piramal Finance pvt. .Ltd","Prabhakar Pandey",150000.0,101,23.0,11.75);
		
		CarLoan c1=new CarLoan("State Bank Of India .Ltd","Muksesh Sharma",100000.0,78954,10.0,8.00);
		
		PersonalLoan p1=new PersonalLoan("Housing Development and Financial Corporation .Ltd","Priya Dhal",450000.0,264967,13.0,9.75);
		
		BusinessLoan b1=new BusinessLoan("Punjab National Bank .Ltd","Jagmohan Dalla",360000.0,64564,15.0,9.75);
		
		GoldLoan g1=new GoldLoan("Gold Loan Services pvt. .Ltd","Shriram Jain",90000.0,9456,6.0,8.75);
		
		System.out.println("\n-------------------Loan Details---------------------------\n");
		l1.getDetails();
		c1.getDetails();
		p1.getDetails();
		b1.getDetails();
		g1.getDetails();
		
		System.out.println("\n\n-------------------EMI details as per defined loan details ----------------------------\n");
		l1.getEmi();
		c1.getEmi();
		p1.getEmi();
		b1.getEmi();
		g1.getEmi();
		
		System.out.println("\n\n-------------------EMI details after setting discount rate ----------------------------\n");
		c1.setDiscountRate(12.25);
		c1.getEmi();
		p1.setDiscountRate(13.11);
		p1.getEmi();
		b1.setDiscountRate(20.45);
		b1.getEmi();
		g1.setDiscountRate(11.20);
		g1.getEmi();
		
		System.out.println("-------------------MAIN EXIT-------------------------------");
	
		
	}

}
