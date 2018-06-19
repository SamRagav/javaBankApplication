package bankaccountapp;

public abstract class Account implements IBaseRate{
	
	private String name;
	private String sSN;   //social Security Number
	private static int index = 10000;
	private double balance;
	protected double rate;
    protected String accountNumber;
	

	public Account(String name, String sSN, double intiDeposit) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.sSN = sSN;
		balance = intiDeposit;
				
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate(); 
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random()* Math.pow(10,  3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}


	public void compound() {
	    double accInterest = balance * (rate/100);
	    balance = balance + accInterest;
	    System.out.println("Interest : $" + accInterest );
        printBalance();
    }

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("WithDrawing $" + amount);
		printBalance();
	}
	public void transfer(String toWhere,double amount){
		balance = balance - amount;
		System.out.println("Transfering $" + amount + "to "+ toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now :" + balance);
	}


	public void showInfo() {
		System.out.println(
				"\t\tNAME : " +name +
				"\n\t\tACCOUNT NUMBER : " + accountNumber +
				"\n\t\tBALANCE : " + balance +
				"\n\t\tRATE : " + rate + "%"
				);
	}
}
