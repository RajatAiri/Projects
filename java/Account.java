package college;


import java.util.*;

public class Account {
	
	public static Scanner sc = new Scanner(System.in);

	public static Account[] ac = new Account[100];


	public static int i=-1;
	String name;
	String accNo;
	double balance;
	String pass;
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	


}