import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("身長1:");
		double height1 = scanner.nextDouble();
		System.out.print("体重1:");
		double weight1 = scanner.nextDouble();

		System.out.print("身長2:");
		double height2 = scanner.nextDouble();
		System.out.print("身長2:");
		double weight2 = scanner.nextDouble();

		double bmi1 = weight1 / (height1 * height1);
		double bmi2 = weight2 / (height2 * height2);

		System.out.println("%.2f",bmi1);
		System.out.println("%.2f",bmi2);
	}
}
