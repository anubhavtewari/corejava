import java.util.Scanner;
import java.lang.Math;
class DoubleOperations{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many no. you want to enter");
	int n = sc.nextInt();
	boolean flag = true;
	if (n==0){
		System.out.println("why you do this?");
		}
	else{
	double[] arr = new double[n];
		System.out.println("Enter the numbers:");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
			}
		while(flag && n!=0){
			System.out.println("\n Which operation you want to perform?");
			System.out.println("1. Double nos. 2. Square nos. 3. Square root nos. 4. Exit");
			int op = sc.nextInt();
			switch(op){
				case 1: for(int i = 0; i < n; i++){
							System.out.print(arr[i]* = 2+" ");
							}
						break;
				case 2: for(int i = 0; i < n; i++){
							System.out.print(arr[i]=arr[i]*arr[i]+" ");
							}
						break;
				case 3: for(double i : arr){
							System.out.print(arr[i] = Math.sqrt(arr[i])+" ");
							}
						break;
				case 4: flag = false;
						break;
				default: System.out.println("Enter valid operation");
				}
				System.out.println("\n Enter how many no. you want to enter");
				n = sc.nextInt();
				System.out.println("\n Enter the no.s now!");
				if(n!=0){
					for(int i = 0; i < n; i++){
						arr[i] = sc.nextInt();
						}
					}
			}
		}
	}
}