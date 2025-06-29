package loan;

public class BusinessLoan extends Loan {
	private double revisedRate;
	BusinessLoan(){
		
	}
	
	BusinessLoan(double rateOfInterest,double discountRate,double durationInYears){
		super(rateOfInterest,durationInYears);
		this.revisedRate=discountRate;
	}
	
	BusinessLoan(String bankName,String loanBearer,double loanAmount,int candidateNo,double durationInYears,double revisedRate){
		super(bankName,loanBearer,loanAmount,candidateNo,durationInYears,revisedRate);
		
	}
	
	double getDiscountRate() {
		
		return revisedRate;
	}
	
	void setDiscountRate(double rate) {
		super.rateOfInterest=rate;
		this.revisedRate=rate;
	}

}
