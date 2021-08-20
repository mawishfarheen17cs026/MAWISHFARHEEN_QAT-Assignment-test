package AssignmentTest;

public class CurrentAccount implements BankAccount {
	
	private String a = "current account";
	
	public void AccountType() {
		System.out.println("this is" +a);
	}
	
	
	
	public void validateUser() {
		System.out.println("user is valid");
	}

	@Override
	public void checkBankBalance() {
		// TODO Auto-generated method stub
		System.out.println("bank balance is Rs.12000");
	}
	

}
