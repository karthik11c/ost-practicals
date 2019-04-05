import java.util.Scanner;

public class Calculator {
	public static int powerInt(int num1, int num2) {
		return (int) (Math.pow(num1, num2));
	}
	public static double powerDouble(double num1, double num2) {
		return(Math.pow(num1, num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Calculator obj=new Calculator();
		System.out.println("Enter to Two Integer value");
		int val1=input.nextInt();
		int val2=input.nextInt();

		System.out.println("Power : "+obj.powerInt(val1, val2));
		System.out.println("Enter to Two Double value");
		double val3=input.nextDouble();
		double val4=input.nextDouble();
		System.out.println("Power :"+obj.powerDouble(val3, val4));
	}

}
