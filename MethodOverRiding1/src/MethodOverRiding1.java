
public class MethodOverRiding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi=new RBI();
		HDFC hdfc=new HDFC();
		SBI sbi=new SBI();
		
		rbi.interestRate();
		hdfc.interestRate();
		sbi.interestRate();
	}

}
