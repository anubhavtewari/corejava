/*
Create another class(for the purpose of separation)  : TestBox --for  UI. 
Add psvmain(..){...}
Use scanner --to accept box dims from user, create box instance.
display its details & volume.
*/
//UI
package com.cdac.tester;
import com.cdac.core.Box;
import java.util.Scanner;
class CreateBox{
	public static void main(String[] args){
		//create Scanner instance wrapping stdin: System.in: InputStream
		Scanner sc = new Scanner(System.in);
		Box b1; //till now no obj is created. ref type var: class type (i.e. can ONLY refer to Box type obj), as per JVM's specs: 4/8/16 bytes are allocated in stack frame of main(...), no box type objs created so far.
		System.out.println("Enter box details: width depth height"); // 10 20 30
		b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble()); // RHS: Box class instance, created in Heap
		System.out.println(b1.getBoxDimensions());
		System.out.println(b1.getVolume());
		Box b2= b1; // copy of refs
		System.out.println(b2.getBoxDimensions());
		b1 = null;
		// System.out.println(b1.getBoxDimensions()); //NP Exception
		// how many objs marked for GC ? 0
		System.out.println(b2.getBoxDimensions());
		b2 = null; // how many objs marked for GC ? 1
		Box b3 = new Box(2,3,4);
		b3 = new Box(2,3,4); // how many objs marked for GC? 1 earlier box obj(from line no. 25)
		sc.close();
		System.out.println("main over");
	}
}