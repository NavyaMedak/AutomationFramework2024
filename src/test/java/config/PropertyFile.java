package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.Test1_GoogleSearch2_TestNG;

public class PropertyFile {

	static Properties pop=new Properties();
	static String ProjectPath=System.getProperty("user.dir");

	public static void main(String[] args) {
		getProperties();
		setProperties();
	
	}

	public static void getProperties()
	{

		try {

			InputStream input=new FileInputStream(ProjectPath+"/src/test/java/config/config.properties");
			pop.load(input);
			String brow=pop.getProperty("browser");
			System.out.println(brow);
			Test1_GoogleSearch2_TestNG.browserName=brow;

		}catch (Exception exe) 
		{
			// TODO Auto-generated catch block
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}


	}

	public static void setProperties()
	{


		try {
			OutputStream output=new FileOutputStream(ProjectPath+"/src/test/java/config/config.properties");
		
		     pop.setProperty("result","pass");
		     pop.store(output, null);
		
		}
		catch (Exception exe) 
		{
			// TODO Auto-generated catch block
			System.out.println(exe.getMessage());
			System.out.println(exe.getCause());
			exe.printStackTrace();
		}

	}



}
