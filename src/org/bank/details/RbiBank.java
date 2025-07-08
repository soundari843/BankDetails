package org.bank.details;

public class RbiBank extends StateBank{
	private void fixed() {
		System.out.println("fixed:20%");
	}
	@Override
	
	public void savings() {
		super.savings();
		System.out.println("\tsavings:10%\n");
	}
	public static void main(String[] args) {
		RbiBank r = new RbiBank();
		r.fixed();
		r.savings();
		r.deposite();
	}
	private void loan() {
		System.out.println("Loan: 5%");

	}
		
	

}
