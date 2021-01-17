package encapsulation;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj = new Bank();
		//obj.pinNo=2222;
		//obj.balanceAmount=2000000;
		
		obj.updatePin(123456, 1234, 2555);
		
		obj.withdrawAmount(123456, 2555, 25000);
		
	}

}
