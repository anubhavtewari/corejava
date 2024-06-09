package com.cdac.tester;

import java.util.Scanner;

import com.cdac.core.Box;

public class CreateCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of the cube:");
		Box cube = new Box(sc.nextDouble());
		System.out.println("Size of the cube: "+cube.getBoxDetails());
		System.out.println("Volume: "+cube.getBoxVolume());
		//create default init box with all sides -1
		Box dummyBox = new Box();
		System.out.println(dummyBox.getBoxDetails());
		sc.close();
	}

}
