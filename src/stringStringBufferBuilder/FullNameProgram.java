package stringStringBufferBuilder;

public class FullNameProgram {
	
	public static void main(String[] args) {
		
		
		String s = "supriya/pramod/pragati";
		
		String names[] = s.split("/");
		
		for (int i = 0; i < names.length; i++) {
			
			System.out.print(names[i].substring(0,1).toUpperCase() + names[i].substring(1) + " ");
			
		}
		
	    
	    
	}

}
