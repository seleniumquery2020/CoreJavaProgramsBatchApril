package conditionalStatement;

import java.util.Iterator;

public class ThreeDimesionalArray {

	
	public static void main(String[] args) {
		
		 int  arr[][][] =  { { {1,2,3}, {4,5,6} } , { {11,12,13}, {14,15,16}} };
		 
		 
		 System.out.println("First Dimension = "+arr.length);
		 
		 System.out.println("Second Dimension = "+arr[0].length);
		 
		 System.out.println("Third Dimension = "+arr[0][0].length);
		 
		 for (int i = 0; i < arr.length; i++) {
			 
			 for (int j = 0; j < arr[i].length; j++) {
				
				 for (int j2 = 0; j2 < arr[i][j].length; j2++) {
					
					 System.out.println("value = "+arr[i][j][j2]);
				}
			}
			
		}

	}
}
