package test;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class ReadngFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("c:\\filewritting\\mytext.txt");
		FileReader fr =new FileReader(f);
		BufferedReader reader= new BufferedReader(fr);
		String line=null;
		while((line=reader.readLine() )!=null){
		System.out.println(line);	
		}
		reader.close(); 
	}
	

}
