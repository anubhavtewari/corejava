package test_static;
import java.util.Scanner;
public class Test2 {
	
	private static int counter = 10;
	private int data;
	
	static {
		System.out.println("In SIB counter= "+(counter++));
		inc();
	}
	static {
		System.out.println("In another SIB");
	}
	//non-static init block. called at time of instantiation (obj creation). if obj is not created, it will not be executed
	{
		System.out.println("In instance init block");
	}
	public Test2(int data) {
		this.data = data;
	}
	public static void main(String[] args) {
		System.out.println("in main counter= "+counter);
		Test2 t1 = new Test2(1234);
		System.out.println(t1.data);
		System.out.println(t1.getClass());
		Test2 t2 = new Test2(1235);
		System.out.println(t2.data);
		System.out.println(t2.getClass()); // test_static.Test2
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.getClass()); // java.util.Scanner
		sc.close();
		}
	
	static void inc() {
		System.out.println("in inc");
		counter++;
	}
}


/*
 static IB will be loaded first, even before main. SIB is called at the time of class loading
 all SIBs will be called 
 then main method
 at line 24, obj is created, so non static init block will be called. then constr(line 19), then 24th line
 */
