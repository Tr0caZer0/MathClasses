package mathByCB;

public class SavingsAccount {
	
	static double rate; 
	private double balance;
	
	
	public SavingsAccount(double balance, double rate){
		
		if (balance > 0) {
			this.balance = balance;
		}
		
		SavingsAccount.rate = rate;
		
	}// End constructor 
	
	public double calculateMontlyInterest() {
		
		double 	monthlyRate = (balance*rate)/12;
		
		double newBalance = balance + monthlyRate ;
		
		this.balance = newBalance;
		
		return newBalance;
	}// End calculateMontlyInterest method

	public void changeRate(double balance, double rate){
		
		this.balance = balance;
		SavingsAccount.rate = rate;
		
	}// end changeRate method
}
