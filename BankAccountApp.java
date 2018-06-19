package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Cheking chacc1 = new Cheking("Tom Crouse","324253435",15000);

        Savings savacc1 = new Savings("Sam Ragav","374828495",20000);


        savacc1.compound();

        chacc1.showInfo();
        System.out.println("********************");
        savacc1.showInfo();


*/
		List<Account> accounts = new LinkedList<Account>();

         String file = "C:\\Users\\Sampath\\Desktop\\Java practice\\NewBankAccounts.csv";

		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder){
			System.out.println("New Account");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initdeposit = Double.parseDouble(accountHolder[3]);
			System.out.println("\t\tNAME : " + name +
					           "\n\t\tSSN : " + sSN +
					           "\n\t\tACCOUNT TYPE : " + accountType +
					           "\n\t\tINITIAL DEPOSIT : $"+ initdeposit
			                     );
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initdeposit));
			}
			else if(accountType.equals("Checking")) {
				accounts.add(new Cheking(name, sSN, initdeposit));
			}
			else {
				System.out.println("Error Account Type");
			}
		}

		for (Account acc: accounts) {
			System.out.println("*******______*******\t*******______*******\t*******______*******\n");
            acc.showInfo();
		}

	}

}
