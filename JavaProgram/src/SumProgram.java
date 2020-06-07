import java.util.Scanner;

public class SumProgram {
	public int add() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first no: ");
	int a=sc.nextInt();
	System.out.println("Enter second no: ");
	int b=sc.nextInt();
	int sum=a+b;
	return sum;
		
	}
	public static void main(String[] args) {
		
		SumProgram myObj=new SumProgram();
		System.out.println("Sum of two numbers are: " +myObj.add());
	}

}
