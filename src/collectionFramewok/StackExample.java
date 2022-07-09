package collectionFramewok;

import java.util.Stack;

public class StackExample {
	
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		stack.addElement(101);
		stack.addElement('a');
		stack.addElement("Selenium");
		stack.addElement(true);
		stack.addElement(3.14);
		stack.addElement(51);
		stack.addElement('W');
		
		System.out.println("Original Stack = "+stack);
		
		stack.pop();
		System.out.println("Updated Stack = "+stack);
		
		System.out.println("Peek method = "+stack.peek());
		
		System.out.println("Updated Stack = "+stack);
	}

}
