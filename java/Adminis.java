package college;
import java.io.*;

public class Adminis extends Account{
	
///////////////////////////////////////////////////////////	
	
	public void delAll(){
		System.out.println("Enter Admin Name : ");
		String ss,sa;;
		ss = sc.next();
		System.out.println("Enter Admin Password : ");
		sa = sc.next();
		if(ss.equalsIgnoreCase("Admin") &&sa.equalsIgnoreCase("Password")){
			System.out.println("All Accounts Deleted");
			i=-1;
		}
	}	
	
	
	public void viewAll(){
		System.out.println("Enter Admin Name : ");
		String ss,sa;;
		ss = sc.next();
		System.out.println("Enter Admin Password : ");
		sa = sc.next();
		if(ss.equalsIgnoreCase("Admin") &&sa.equalsIgnoreCase("Password")){
			System.out.println("Name\tBalance");
			for(int ii=0;ii<=i;ii++){
				System.out.println(ac[ii].getName()+"\t"+ac[ii].getBalance());
			}
		}else System.out.println("Wrong Input");
		this.file();
	}
	
	public void file(){
		try{
			
			BufferedWriter bout = new BufferedWriter(new FileWriter("bank.txt",true));
			System.out.println("Writing to file - bank.txt");
			
				for(int ii=0;ii<=i;ii++){
					bout.write(ac[ii].getName()+" ");
					String sp =ac[ii].getBalance()+" ";
					bout.write(sp);
					bout.newLine();
				}
				bout.close();
			
			
		}catch(Exception e){}
	}

	

}