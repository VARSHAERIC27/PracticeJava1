package AbstactionAssignment;

public class Contractor extends Employee {
	public  void calculateSalary(int value,int hour) {
		int total= value*hour;
		System.out.println("total="+total);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj= new Contractor();
		obj.calculateSalary(5000, 4);
		FulltimeEmployee obj1= new FulltimeEmployee();
		obj1.calculateSalary(6000,8);
		
	}

}
