import java.util.Scanner;

public class Demo {
	
	
		
		public static void m1() 
		{
		try {
			System.out.println("1 line");
			System.out.println("2 line");
			System.out.println("3 line");
			System.out.println("4 line");
		    int a=10/0;
		   System.out.println("10 line");
		}
		catch( ArithmeticException e) {
			System.out.println("hello durga");
		}
		catch(Exception  e) {
			System.out.println("hello durga sir");
			
		}
		finally{
			System.out.println("hello team");
			
		}
		System.out.println("five line");
		System.out.println("six line");
		}	
		public static void main(String[] args) {
	
	
	}
}
