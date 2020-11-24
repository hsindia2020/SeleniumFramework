package com.pcs.log4j2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class
propertiesfile {

	public static void main(String[] args) {
		getProperties();
	}

	public static void getProperties(){
			try {
				Properties prop = new Properties();
				String projectpath = System.getProperty("user.dir");

				InputStream input;
				input = new FileInputStream(projectpath+"/src/main/resources");
				try {
					prop.load(input);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			String browservalue = prop.getProperty("browser"); 
			System.out.println("Broswer value is "+browservalue);
			} catch (FileNotFoundException e) {
				e.getCause();
				e.notify();
				e.printStackTrace();
			}

	}

}