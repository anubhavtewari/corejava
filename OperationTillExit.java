import java.util.Scanner;
public class OperationTillExit{
	public static void main(String[] a){
		boolean flag = true;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		while(flag == true){
			System.out.println("Enter two nos.");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			System.out.println("Enter operation: 1. + 2. - 3. * 4. / 5. Exit");
			int op = sc.nextInt();
			switch(op){
				case 1: result = n1 + n2;
						System.out.println(result);
						break;
				case 2: result = n1 - n2; 
						System.out.println(result);
						break;
				case 3: result = n1 * n2;
						System.out.println(result);
						break;
				case 4: if(n2 != 0){
						result = n1 / n2;
						System.out.println(result);
						}
						else System.out.println("Can't / by 0");
						break;
				case 5: System.out.println("Exiting!");
						flag = false;
						break;
				default: System.out.println("Enter valid input!");
			}
		}
	}
}