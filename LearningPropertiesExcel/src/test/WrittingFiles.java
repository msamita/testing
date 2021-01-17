package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.Writer;


public class WrittingFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("c:\\filewritting\\mytext.csv");
		FileWriter fw= new  FileWriter(f,true);
		BufferedWriter writer= new BufferedWriter(fw);
	
		writer.write("amita Sharma");

	writer.newLine();
	writer.write(" live in USA");   
//	writer.newLine();
	writer.write("UKSA");
	writer.close();
	System.out.println("file created");
	}
}