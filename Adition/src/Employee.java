
public class Employee {
	int empId;
	String name;
	 static String contry="india";
	
	Employee(int empId,String name)
	{
		this.empId=empId;
		this.name=name;
	}
	void dispay() {
	
	System.out.println(empId+" "+name+" "+contry);	
	}
	
	public static void main(String args[])
	{		
		Employee emp1=new Employee( 101,"ramesh");
		emp1.dispay();
		Employee emp2=new Employee(102,"satish");
		emp2.dispay();
		Employee emp3=new Employee(103,"digambar");
		emp3.dispay();
		Employee emp4=new Employee(104,"deepak");
		emp4.dispay();
		Employee emp5=new Employee(105,"sudhakar");
		emp5.dispay();
		Employee emp6=new Employee(106,"balu");
		emp6.dispay();
	}}
		
		
	
	


