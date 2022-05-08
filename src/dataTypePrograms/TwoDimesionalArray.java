package dataTypePrograms;

public class TwoDimesionalArray {
	
	public static void main(String[] args) {
		
	 //If u decide to create array as arr[2][3] then in Single Curly bracket put first dimension 
	// size curly bracket and inside each bracket put second dimension size values
		
		String str[][] = { {"Pune","Delhi"} , {"India","UK","US"}  };
		
		System.out.println(str[1][2]);
		
		System.out.println("First Dimension = "+str.length);
		
		System.out.println("0 index Second Dimesion = "+ str[0].length);
		
		System.out.println("1st index Second Dimesion = "+ str[1].length);
	}

}
