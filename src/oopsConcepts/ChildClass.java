package oopsConcepts;

public class ChildClass extends BaseClass{

	public void print(){
		System.out.println("Print method from child class");
	}
	
	@Override
	void demoMethod() {
		System.out.println("Demo method from ChildClass");
	}
	
	public static void main(String[] args) {

		ChildClass child = new ChildClass();
		child.demoMethod();
		child.display();
		child.print();

		BaseClass base = new ChildClass();
		base.demoMethod();
		base.display();
		// base.print(); // Error - The method print() is undefined for the type BaseClass

		AbstractClass abstractClass = new ChildClass();
		abstractClass.demoMethod();
		// abstractClass.display(); //The method display() is undefined for the type
		// AbstractClass
		// abstractClass.print(); //The method print() is undefined for the type
		// AbstractClass

	}

}
