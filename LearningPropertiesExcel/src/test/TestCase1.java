package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestCase1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properies");
		prop.load(fis);
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
		System.out.println(prop.getProperty("rollno"));
		System.out.println(System.getProperty("user.dir"));


	}
}

  