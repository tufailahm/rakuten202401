package com.bms.raukten.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFileContents {

	public static void main(String[] args) {
		
		
		File file = new File("h:\\todo.txt");	
		
		try {
			FileInputStream fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
