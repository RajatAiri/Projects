package college;

import java.util.InputMismatchException;
import java.io.*;
import java.util.Scanner;

public class Implement extends Account implements Operations{
///////////////////////////////////////////////////////////	
	
	
	
	
///////////////////////////////////////////////////////////	
	
	//MAIM METHOD
	public static void main(String args[]){
		Account temp = new Account();
		Implement imp = new Implement();
		Adminis adm = new Adminis();
		
		try{
		int ch;
		while(true){
				imp.intro();
				ch=sc.nextInt();
				switch(ch){
				
				case 1:
					++i;
					ac[i] = new Account();
					temp=imp.newAccount(ac[i]);
					ac[i]=temp;
					break;
					
				case 2:
					imp.banking();
					break;
					
				case 3:
					imp.modify();
					break;
					
				case 4:
					imp.myDetails();
					break;
				case 5:
					int ad;
					imp.Admin();
					ad = sc.nextInt();
					
					switch(ad){
					case 1:
						adm.viewAll();
						break;
					case 2:
						adm.delAll();
						break;
					default:break;
					}
				case 10:
					System.out.println("Exiting from System.");
					break;
				
				default:
					System.out.println("[*Invalid choice*]");
					break;
				}	
		}
		}catch(InputMismatchException e){
			System.out.println("##ERROR##\nINPUT MISMATCH EXCEPTION CAUGHT.\n");
		}
	

		}
	
///////////////////////////////////////////////////////////	
	public void intro(){
		
		System.out.println("------------------------------");
		System.out.println("=> Welcome to ONLINE Banking||");
		System.out.println("=> Please select an option: ||");
		System.out.println("|| 1.New Account            ||");
		System.out.println("|| 2.Banking                ||");
		System.out.println("|| 3.Modify Account         ||");
		System.out.println("|| 4.My Account             ||");
		System.out.println("|| 5.Admin                  ||");
		System.out.println("|| 10.exit                  ||");
		System.out.println("------------------------------");

		
	}
///////////////////////////////////////////////////////////	
	
	
	public void Admin(){
		System.out.println("###########################");
		System.out.println("# 1.View All Acounts      #");
		System.out.println("# 2.Delete All Accounts   #");
		System.out.println("###########################");

	}
///////////////////////////////////////////////////////////	
	
	
///////////////////////////////////////////////////////////	
	
	
	public Account newAccount(Account ac){

		String name;
		String accNo;
		double balance;
		String pass;
		
		
		System.out.println("Enter name : ");
		
		name = sc.next();
		ac.setName(name);
		
		
		
		System.out.println("Enter Account Number : ");
	
		accNo = sc.next();
		ac.setAccNo(accNo);
		
		
		System.out.println("Enter Account Balance : ");
		
		balance = sc.nextDouble();
		ac.setBalance(balance);
		
		
		
		System.out.println("Enter Password");
		
		pass = sc.next();
		ac.setPass(pass);
	
		

		return ac;
	
	}

///////////////////////////////////////////////////////////	

	public void modify(){
		Account temp;
		System.out.println("Enter Account Number");
		String acc;
		String ass;
		int count=0;
		int k;
		acc = sc.next();
		System.out.println("Enter Password : ");
		ass = sc.next();
		for(k=0;k<=i;k++){
			//System.out.println(ac[k].getAccNo());
			if(ac[k].getAccNo().equals(acc)&&ac[k].getPass().equals(ass)){
				System.out.println("Enter new Name : ");
				acc = sc.next();
				ac[k].setName(acc);
				count=1;
				System.out.println("Details changed.");
			}
			else if(count ==1){
				break;
			}
		}
		if(count ==0)
			System.out.println("Account not found/InValid");
		
	}
///////////////////////////////////////////////////////////	

	public void banking(){
		System.out.println("Enter Account number : ");
		String acc;
		double cash;
		
		int count=0;
		int k;
		
		acc = sc.next();
		String ass;
		System.out.println("Enter Password : ");
		ass = sc.next();
		for(k=0;k<=i;k++){
			if(ac[k].getAccNo().equals(acc)&&ac[k].getPass().equals(ass)){				System.out.println("Select Option");
				System.out.println("1.Withdraw");
				System.out.println("2.Deposit");
				count=1;
				int ch = sc.nextInt();
				switch(ch){
				case 1:System.out.println("Enter withdraw amount");
					cash=sc.nextDouble();
					ac[k].setBalance(ac[k].getBalance()-cash);
					System.out.println("Balance left: "+ac[k].getBalance());
					break;
				case 2:System.out.println("Enter Deposit amount");
					cash=sc.nextDouble();
					ac[k].setBalance(ac[k].getBalance()+cash);
					System.out.println("Total Balance: "+ac[k].getBalance());
					break;
				}
				count=1;
			}
			else if(count ==1){
				break;
			}
		}
		if(count ==0)
			System.out.println("Invalid Password. Please enter correct password.");
		
		
	}
///////////////////////////////////////////////////////////	
	
	public void myDetails(){
		Account temp;
		System.out.println("Enter Account number : ");
		String acc;
		int count=0;
		int k;
		acc = sc.next();
		String ass;
		System.out.println("Enter Password : ");
		ass = sc.next();
		for(k=0;k<=i;k++){
			if(ac[k].getAccNo().equals(acc)&&ac[k].getPass().equals(ass)){				System.out.println("Select Option");
				System.out.println("|Account Number |\t|Name |\t\t|Balance|");
				System.out.println("|"+ ac[k].getAccNo()+"\t\t|\t|"+ac[k].getName()+"|"+"\t\t"+"|"+ac[k].getBalance()+"|"+"\n\n");
				count=1;
			}
			else if(count ==1){
				break;
			}
		}
		if(count ==0)
			System.out.println("Account not found");
	}
///////////////////////////////////////////////////////////	
///////////////////////////////////////////////////////////	

}