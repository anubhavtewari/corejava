import java.util.Scanner;
public class CreateNewEmployee{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp details: id name salary");
		Employee e = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println(e.getEmpDetails());
		sc.close();
	}
}