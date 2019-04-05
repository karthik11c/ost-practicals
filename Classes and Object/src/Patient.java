import java.util.Scanner;

public class Patient {

	public static String patientName;
	public static double height;
	public static double weight;
	static Scanner input=new Scanner(System.in);
	public Patient(String name, double ht, double wt){
		this.patientName=name;
		this.height=ht;
		this.weight=wt;
	}
	public static double computeBMI() {
		double BMI=weight+height*height;
		return BMI;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter the Patient Name");
		patientName=input.next();
		System.out.println("Enter the Patient height");
		height=input.nextDouble();
		System.out.println("Enter the weight in kg");
		weight=input.nextDouble();
		Patient obj=new Patient(patientName, height, weight);
		System.out.println("BMI of Patient : "+obj.computeBMI());
				
	}

}
