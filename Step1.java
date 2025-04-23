package Day1;
import java.util.Scanner;

public class Step1 {

	public static void main(String[] args) {
	 
		
//	Printable printer= (a,b)-> a+"&"+b;
//	 
//	 String res=printer.print("Hello", "World");
//	 System.out.print("Combined::"+res);
	
	try (Scanner sc = new Scanner(System.in)) {
		Operation operator = null;
		int result=0;
		System.out.println("Enter 2 numbers::");
		int a= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter your choice::1 to Add, 2 to Subtract, 3 to Multiply, 4 to Divide");
		int c=sc.nextInt();
		if(c==1) {
			 operator= (d,e) -> d+e;
		}
		if(c==2) {
			operator= (d,e) -> d-e;
		}
		if(c==3) {
			operator= (d,e) -> d*e;
		}
		if(c==4) {
			calculator calc = new calculator();
			result=calc.operate(a, b);
		}
		
		
		result= result==0?operator.operate(a,b):result;
		System.out.print(result);
	}
	
		
	 
	}

}
