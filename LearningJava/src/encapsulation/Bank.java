package encapsulation;

public class Bank {
	
	public int accountNo=123456;
	private int pinNo=1234;
	private double balanceAmount=1000000;
	

	
public void withdrawAmount(int accNo,int pin,int amount){
		
		if(accNo==accountNo && pin==pinNo){
			
			if(amount<=balanceAmount){
				
				balanceAmount=balanceAmount-amount;
				System.out.println("Amount withdrwal : "+amount);
				
				
			}else{
				
				System.out.println("Insufficient Balance !!!");
			}
			
		}else{
			
			System.out.println("Invalid credentials !!!");
	
		}
}
		public void updatePin(int accNo, int oldPin, int newPin){
			
			if(accNo==accountNo && oldPin==pinNo){
				
				pinNo=newPin;
				System.out.println("Pin changed successfully !!!");
				
				
			}else{
				
				System.out.println("Invalid credentials");
			
			
		
}
}
}
