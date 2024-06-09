/*
Objective --
Create a class to represent 3D Box 
class Box ---tight encapsulation(achieved by making all non static data members:instance vars private)
state -- width,height , depth --- double : private 

paramterized constr --3 arg constr.

Instance Methods(=non static methods)
1. To return Box details in String form (dimensions of Box)

method declaration --- access specifier(private/default/protected/public) , ret type , name , args , throws clause

method definition --body

2. To return computed volume of the box.
*/
//this class has core features of box, UI will be written separately
package com.cdac.core;
public class Box{
	// tight encapsulation
	private double width, depth, height; // these are non-static var (instance var)
	// add param. constr to init COMPLETE state of the Box
public Box(double width, double d, double height){
		this.width = width; //this: MANDATORY
		this.depth = d; //this: OPTIONAL
		this.height = height; // this: MANDATORY
	}
	// add a method to return Box details in String form (Dimensions of box)
public String getBoxDimensions(){
		// we can directly access the current object reference is implicitly passed for non static methods
		return "Box Dimensions: width: "+this.width+" depth: "+this.depth+" height: "+this.height;
	}
	// add non-static method to return computed volume of the box
public double getVolume(){
		return width*depth*height; //javac implicitly adds this to instance var 
	}
}