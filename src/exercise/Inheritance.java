package exercise;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal objB = new B();
		Animal objC = new C();
//		Animal animal = new Animal();
		objC.saySomething();
	}

}

//abstract class Animal {
//	abstract void saySomething();
//	public void walk() {
//		System.out.println("We all work");
//	}
//}

interface Animal {
	public void eat();
	public void saySomething();
}

class B implements Animal{
	
	public void saySomething() {
		System.out.println("New B");
		
	}
	public void eat() {
		System.out.println("amnomnom");
	}
}

class C extends B{
	public void saySomething() {
		System.out.println("new C from B");
		
	}
//	public void eat() {
//		System.out.println("chamcham");
//	}
}











