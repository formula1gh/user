package com.exam.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
	    // 使用ClassLoader加载properties配置文件生成对应的输入流
	    InputStream in = Main.class.getClassLoader()
	    		.getResourceAsStream("db.properties");
	    // 使用properties对象加载输入流
	    properties.load(in);
	    //获取key对应的value值
	    String a = properties.getProperty("database.url");
	    System.out.println(a);
	    Enumeration en = properties.propertyNames();  
	    while (en.hasMoreElements()){  
             String key = (String) en.nextElement();  
             String value = properties.getProperty(key);  
             System.out.println(key + " : " + value);  
         } 
	}

}
