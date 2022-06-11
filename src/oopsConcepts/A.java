package oopsConcepts;

public  class A {
	
	int a = 785;
	String s = "ParentClass Variable";
	
	public A() {
		System.out.println("A Grand Parent class Constructor");
	}
	
	public A(boolean b) {
		System.out.println("A Grand Parent class "
				+ "Constructor with boolean");
	}
	
	public void m1() {
		System.out.println("m1 Parent class Instance method");
	}

	public static void m2() {
		System.out.println("m2 Parent class static method");
	}
		
	
}
