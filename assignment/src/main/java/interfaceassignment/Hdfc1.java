package interfaceassignment;

public class Hdfc1 implements Rbi{

	public  void recuringDeposit(int amount,int duration) {
		float total= amount+(amount*duration*rate);
System.out.println("final amount="+total);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc1 obj= new Hdfc1();
		obj.recuringDeposit(20000, 5);
	}

}
