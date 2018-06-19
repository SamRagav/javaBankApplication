package bankaccountapp;

public class Cheking extends Account {
	
	private int debitCardNumber;
	private int debitCardPin;

	public Cheking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo(){
		super.showInfo();
        System.out.println("Your Checking Account Features" +
		                    "\nDebitCard Number : " + debitCardNumber +
		                    "\nDebitCard Pin    : " + debitCardPin
        		);
	}
}
