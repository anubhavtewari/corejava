import java.util.Scanner;
public class PrintAverage{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two double values:");
		if(sc.hasNextDouble()){
			double n1 = sc.nextDouble();
			if(sc.hasNextDouble()){
				double n2 = sc.nextDouble();
			System.out.println((n1 + n2) / 2);
			}
			else
				System.out.println("Invalid input");
		}
		else
			System.out.println("Invalid input");
	}
}