package AssignmentTest;

public class aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentAccount ca = new CurrentAccount();
		SavingsAccount sa = new SavingsAccount();
		ca.validateUser();
		ca.AccountType();
		ca.checkBankBalance();
		sa.validateUser();
		sa.AccountType();
		sa.checkBankBalance();

	}

}
