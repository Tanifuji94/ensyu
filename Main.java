import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("height:");
		double height1 = scanner.nextDouble();
		System.out.print("weight:");
		double weight1 = scanner.nextDouble();

		System.out.print("height:");
		double height2 = scanner.nextDouble();
		System.out.print("weight:");
		double weight2 = scanner.nextDouble();

		double bmi1 = weight1 / Math.pow(height1,2);
		double bmi2 = weight2 / Math.pow(height2,2);

		System.out.println(bmi1);
		System.out.println(bmi2);
	}
}
