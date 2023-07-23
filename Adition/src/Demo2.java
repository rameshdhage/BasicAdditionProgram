import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr your number");
	int num=sc.nextInt();
	int marks=num;
	if(marks>=90 && marks<100) {
		System.out.println("First classs distention>>");
	}
	else if(marks>=80 && marks<90) {
		System.out.println("A grade>>");
	}
	else if(marks>=70 && marks<80) {
		System.out.println("B grade>>");
	}
	else if(marks>=70 && marks<60)	{
		System.out.println("c grade>>");
	}
	else if(marks>=60 && marks<50){
		System.out.println("D grade>>");
	}
	else
	{
		System.out.println("this is fail");
		
	}
	System.out.println(num);

}}
