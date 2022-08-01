package com.config.helper;

public class FileReadermanager {
	//singleton- private constructor,static method and non static method will be there must in a class
	
	//private constructor
	private FileReadermanager() {
		
	}
	
	
	
	//static method
	public static FileReadermanager getInstanceFRM() {//changing void into filereadermanager(changing return method type)
		FileReadermanager frm= new FileReadermanager();
		return frm;
	}
	
	
	
	
	
	
	//non static method
	public ConfigurationReader getInstanceCR() throws Throwable {//changing void into configreader(return method type)
		ConfigurationReader cr=new ConfigurationReader();
		return cr;
	}

}
