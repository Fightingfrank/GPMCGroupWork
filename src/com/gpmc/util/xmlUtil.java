package com.gpmc.util;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.jaxen.*;
public class xmlUtil {
	
	//input username, return password
	public static String Userlogin(String username) throws DocumentException {
		File file = new File("User.xml");
		SAXReader xmlReader = new SAXReader();
		Document doc = xmlReader.read(file);
		
		String xpath = "//user[username='" + username +"']/password";
		System.out.println(xpath);
		String password = doc.valueOf(xpath);
		return password;
	}
}
