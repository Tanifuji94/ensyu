import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("身��);
		double height = scanner.nextDouble();
		System.out.println("体重");
		double weight = scanner.nextDouble();

		double bmi = weight / (height*height);

		System.out.println(bmi);
	}
}
