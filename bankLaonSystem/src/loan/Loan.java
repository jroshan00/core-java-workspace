package loan;

public class Loan {
	
	String bankName;
	String loanBearerName;
	String loanType; // eg. HousingLoan, CarLoan, PersonalLoan, BuinessLoan
	String loanCategory;
	int candidadeNo;
	double durationInYears;
	double loanAmount;
	double rateOfInterest=9.75;
	
	
	Loan(){
	
	}
	
	Loan(double rateOfInterest,double durationInYears){
		this.durationInYears=durationInYears;
		this.rateOfInterest=rateOfInterest;
	}
	
	
	Loan(String loanBearer,int candidateNo,double loanAmount,double durationInYears,double rateOfInterest){
		this(rateOfInterest,durationInYears);
		this.loanBearerName=loanBearer;
		this.candidadeNo=candidateNo;
		this.loanAmount=loanAmount;
	}
	
	Loan(String bankName,String loanBearer,double loanAmount,int candidateNo,double durationInYears,double rateOfInterest){
		this(loanBearer,candidateNo,loanAmount,durationInYears,rateOfInterest);
		this.bankName=bankName;
	}
	

	public void getEmi() {
		double monthlyRateOfInterest=((this.rateOfInterest)/12.0);
		double principleAmount=this.loanAmount;
		double tenureInMonths=12*durationInYears;
		double emi=((principleAmount*monthlyRateOfInterest*(Math.pow((1+monthlyRateOfInterest),tenureInMonths)))/((Math.pow((1+monthlyRateOfInterest),tenureInMonths))-1));
		//System.out.println(emi + " -----> " +Math.round(emi));
		System.out.println("Monthly EMI for " + this.loanBearerName +" with annual rate of interest : "+ this.rateOfInterest +"% is : Rs. "+ Double.valueOf(emi).intValue());
		
	}
	
	public void getDetails() {
		System.out.println("*************************************************");
		System.out.println(this);
		System.out.println("*************************************************");
		System.out.println("Issuer Financial Bank is :  "+ this.bankName );
		System.out.println("Bearer of loan is : "+ this.loanBearerName);
		System.out.println("having candidate id : "+ this.candidadeNo );
		System.out.println("Durartion of the loan (In Years) is : "+ this.durationInYears);
		System.out.println("Loan Amount is : "+ this.loanAmount);
		System.out.println("Loan Rate Of Interest is "+ this.rateOfInterest);
	}
	
	static double pow(double digit,double power) {
		double pow=1;
		for(int i=1;i<=power;i++) {
			pow=digit*pow;
		}
		return pow;
	}
	

}
