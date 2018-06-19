package bankaccountapp;

public class Savings extends Account implements IBaseRate {
    
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	public Savings(String name, String sSN, double initDeposit) {
		// TODO Auto-generated constructor stub
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
		safetyDepositBoxKey =  (int) (Math.random() * Math.pow(10,3));
	}
	
		public void showInfo(){
			super.showInfo();
			System.out.println("ACCOUNT TYPE : Savings" );
			System.out.println("Your Savings Account Features " +
			                   "\nSafety Deposit Box Id : "+ safetyDepositBoxID +
			                   "\nSafety Deposit Box Key : " + safetyDepositBoxKey 
					);
		}	
		
		 
}
