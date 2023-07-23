
public class Simple {

	
	int x=5;
	static int y=5;

	public static void main(String args[]) {
		
		Simple simple1 =new Simple();
		System.out.println("non static>>" +simple1. x++);
		System.out.println("static>>"+ simple1.y++);
		
		Simple simple2 =new Simple();
		System.out.println("non static>>"+simple2.x++);
		System.out.println("static>>+simple2.y++");
		
		
		Simple simple3=new Simple();
		System.out.println("non static"+simple3.x++);
		System.out.println("static>>"+simple3.y++);
		
		
		Simple simple4=new Simple();
		
		System.out.println("non static>>"+simple4.x++);
		System.out.println("static>>"+simple4.y++);
		
		
		Simple simple5=new Simple();
		System.out.println("non static >>"+simple5.x++);
		System.out.println("static>>"+simple5.y++);
		
		
	}
}
