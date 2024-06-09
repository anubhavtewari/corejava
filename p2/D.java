package p2;
import p1.A;
class D extends A{
D(){
	//super() => javac impl adds a call to IMMEDIATE parent class ctor
System.out.println(i+" "+j+" "+k+" "+l);
}
}