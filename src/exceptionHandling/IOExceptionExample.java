package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLData;
import java.sql.SQLException;

public class IOExceptionExample {

	public static void fileRead() {

		File file = new File("C:\\CountersignTechnology\\Notes\\softwar-development-life-cycle.png");
		File file1 = new File("C:\\CountersignTechnology\\Notes\\software-development-life-cycle.png");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			try {
				Thread.sleep(5660);
			} catch (InterruptedException e) {
				
			}
		} catch (FileNotFoundException e) {
			
			try {
				fis = new FileInputStream(file1);
			} catch (FileNotFoundException e1) {
				
			}
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				
			}
		}
	}

	public static void main(String[] args) {

		fileRead();

	}

}
