package conditionalStatement;

public class ForLoopTwoDimesionalArray {
	
	public static void main(String[] args) {	
		
		String city[][] = { {"Pune","Delhi","Mumbai"} , {"India","UK","US"}  };
		
		System.out.println("first dimension Size of Array = "+city.length);
		
		System.out.println("Second Dimension of first section = "+ city[0].length);		
		System.out.println("Second dimension Size of second section = "+city[1].length);
				 
		for(int i =0; i < city.length ; i++) { //First Dim Index loop
			
			for(int j = 0 ; j < city[i].length ; j++) {  //Second Dim Index loop
				
				System.out.println(city[i][j]);
				
			}
			
		}
		
	}

}
