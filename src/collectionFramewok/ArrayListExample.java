package collectionFramewok;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Insertion order maintain,Duplicate value allowed,null insertion allowed
public class ArrayListExample {
	
	
	public static void main(String[] args) {
		ArrayList lang = new ArrayList();
		lang.add("C");
		lang.add("CPP");
		lang.add("java");
		lang.add("C#");
		
		ArrayList list = new ArrayList();
		list.add(71);
		list.add('a');
		list.add(true);
		list.add("java");
		list.add(3.14);
		list.add(3,"program");
		list.add("C");
		list.add("CPP");
		list.add("java");
		list.add("C#");
		//list.addAll(lang);
		//list.addAll(1, lang);
		
		System.out.println("original List = "+list);
		
		System.out.println("Size of List = "+list.size());
		
		System.out.println("Contains methods = "+list.contains("java"));
		
		System.out.println("Contains All methods = "+list.containsAll(lang));
		
		//list.forEach( local -> System.out.println(local));
	
		for (int i = 0; i < list.size(); i++) {
			
				System.out.println(list.get(i));
		}
		
		System.out.println("Index of java = "+list.indexOf("java"));
		
		System.out.println("Last Index of java = "+list.lastIndexOf("java"));
		
		list.remove(0);
		
		System.out.println("after modification List = "+list);
		
		list.remove(true);
		
		System.out.println("after modification List = "+list);
		
		list.removeAll(lang);
		
		System.out.println("after modification List = "+list);
		
		list.set(0, "First");
		
		System.out.println("after modification List = "+list);
		
		List list1 = list.subList(0, 2);
		System.out.println("List 1 = "+list1);
		
		LinkedList linkedlist = new LinkedList();
		
	}

}
