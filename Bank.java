package week5.day2;

public class Bank extends SBI1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank objbank = new Bank();
		objbank.bankBalance();
		objbank.ITLoan();
		objbank.cibilScore();
		objbank.creditScore();
		objbank.maximumLoanAmount();
		objbank.minimumBalance();
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("This is for to display CreditScore");
		
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("This is for to display MinimumBalance");
		
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("This is for to display BankBalance");
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("This is for to display MaximumLoanAmount");
		
	}

	public void cibilScore() {
		// TODO Auto-generated method stub
		System.out.println("This is for to display CibilScore");
		
	}
	

}
