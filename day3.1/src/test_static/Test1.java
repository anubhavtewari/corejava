package test_static;
import static java.lang.System.*;
import static java.lang.Math.sqrt;

public class Test1 {
	private int i;
	private static int j;
	public static void main(String[] args) // Test1 class will be loaded here
	{
		// TODO Auto-generated method stub
		show();
		Test1 t = new Test1();
		t.showAgain();
		System.out.println("Sqrt of 25: "+sqrt(25));
	}
	
	static void show() {
		//what all can you access? i, j, both or neither -> j
		// System.out.println(i);
		out.println(j);
	}
	
	void showAgain() {
		//what all can you access? i, j, both or neither -> i and j both
		out.println(i+" "+j);
	}

}
