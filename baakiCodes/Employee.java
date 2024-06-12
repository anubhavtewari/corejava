class Employee
{
	// to achieve tight encapsulation
	// state = non static data members = instance variables
	// memory allocated on the heap
	private int id;
	private String name;
	private double salary;
	
/*
Employee(){
}
*/

// add parameterized constr to initialise COMPLETE state of the object
Employee(int empId, String name, double sal){
	this.id = empId; // empId:method local variable, id:instance variable
	 // no javac error, no runtime error, instance variable name = null
	this.name = name; // this keyword:MANDATORY
	this.salary = sal; // this keyword: OPTIONAL
}
// Add method getEmpDetails: to return string form of complete emp details
String getEmpDetails(){
	return "Emp details : empId= "+this.id+" name " + this.name+ " earning salary " + this.salary;
}
}