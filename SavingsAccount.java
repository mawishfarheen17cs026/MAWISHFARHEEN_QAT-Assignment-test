package AssignmentTest;

public class SavingsAccount implements BankAccount {
	
	private String b = "SAvings Account";
	
	public void AccountType() {
		System.out.println("This is" +b);
	}

	@Override
	public void checkBankBalance() {
		// TODO Auto-generated method stub
		System.out.println("bank balance is 0");
		
	}

	@Override
	public void validateUser() {
		// TODO Auto-generated method stub
		System.out.println("user invalid");
	}

	
}
