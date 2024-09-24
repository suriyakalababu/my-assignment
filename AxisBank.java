package week6Day3;

public class AxisBank  extends BankInfo{
	public void deposit() {
		System.out.println("Deposit Amount");
		
	}

	public static void main(String[] args) {
		AxisBank obj =new AxisBank ();
		obj.saving();
		obj.deposit();
		obj.fixed();
	}

}
