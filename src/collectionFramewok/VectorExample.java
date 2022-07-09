package collectionFramewok;

import java.util.Enumeration;
import java.util.Vector;

//Insertion order maintain,Duplication allowed
public class VectorExample {

	public static void main(String[] args) {

		Vector vector = new Vector();
		vector.addElement(101);
		vector.addElement('a');
		vector.addElement("Selenium");
		vector.addElement(true);
		vector.addElement(3.14);
		vector.addElement(51);
		vector.addElement('W');
		vector.addElement("Java");
		vector.addElement(true);
		vector.addElement(5.14);

		System.out.println(vector);
		
		System.out.println("Size of vector = " + vector.size());
		System.out.println("Capcity of vector = " + vector.capacity()); 
		
		vector.add(852);

		System.out.println(vector);
		//when capacity is changes it will use oldcapacity*2 formula
		System.out.println("After adding value Size of vector = " + vector.size());
		System.out.println("After adding value Capcity of vector = " + vector.capacity());

		vector.trimToSize();

		System.out.println("Capcity of vector after trim = " + vector.capacity());

        System.out.println(vector.elementAt(0)); //same as get() method
        
        Enumeration enumeration = vector.elements();
        
        while(enumeration.hasMoreElements()) {
        	
        	System.out.println(enumeration.nextElement());
        }
        
     
	}

}
