package oopsConcepts;
//RunTime/Late-Binding/dynamic Polymorphism

//Use super and this keyword In non-static method only
//Use super() /this() to Constructor call and it must be the first statement in a constructor

 class OverrideExample extends A{

	public OverrideExample() {
	
		 super(true); //Parent class Constructor
		 System.out.println("Override Example class non para Constructor");
	}
	
	public OverrideExample(float f) {
		this(); //Same class Constructor
		System.out.println("Override Example class Constructor with float");
	}
	
	public void m1() {
		int mul = 9*5;
		System.out.println(mul);
		super.m1(); //to call parent class method
		this.m3(); //to call child class method
	}
	
	public void m3() {
		super.m2();
		System.out.println("m3 Child class Instance method");
	}
	
	public static void main(String[] args) {
		
		OverrideExample a = new OverrideExample(3.14f);
		 a.m1();
		 
	}
	
}
