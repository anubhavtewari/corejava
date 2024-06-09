/*
 Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.

Display array data using for-each loop
 */
package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class TestPrimArray {

	public static void main(String[] args) {
		double[] data; // no class loaded and no objs created n heap: at this statement
		//data: ref type of var: array type of ref, can refer to array obj holding double vals, memory allocated on stack
		Scanner sc = new Scanner(System.in);
		System.out.println("How many double vals to store?"); //4
		data = new double[sc.nextInt()]; //class [D : method area, heap: 6 slots -> CP, length=4, 0...3 
		System.out.println("def array contents using for loop");
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println("\n Name of the loaded class:"+data.getClass()); //[D
		
		for(int i = 0; i < data.length; i++) {
			System.out.println("Enter data");
			data[i] = sc.nextDouble();
		}
		//display array contents using for-each loop
		System.out.println("Array contents: for-each");
		for(double d: data) // d = data[0], data[1].... data[data.length-1] 
		{
			System.out.print(d+" ");
			d*=2;
		}
		for(double d: data) // d = data[0], data[1].... data[data.length-1] 
		{
			System.out.print(d+" "); // original vals will be printed, not double
		}
		System.out.println();
		System.out.println("Array contents via Arrays.toString");
		//do you know a method to display array contents directly: w/o for each-loop
		System.out.println(Arrays.toString(data));
		
		sc.close();	
	}

}
