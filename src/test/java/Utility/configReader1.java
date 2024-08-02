package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.OutputStream;
import java.util.Properties;

public class configReader1 {
	private static Properties prop;
	private final static String configFilePath= "configs/config.properties";

	public static  Properties init_prop() {
		prop=new Properties();
		
		try {
			FileInputStream fis=new FileInputStream(configFilePath);
			prop.load(fis);
		}catch(FileNotFoundException exp) {
			exp.printStackTrace();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	return prop;
}
	public void init_url() {
		String homeurl=prop.getProperty("url.base");
		System.out.println(homeurl);
		
	}
	public String homeurl() {
		String homepageurl=prop.getProperty("homepage");
		if(homepageurl != null)
		return homepageurl;
		else
			throw new RuntimeException("homeurl not specified in config.properties file");

	}
	public static void init_driver(String browser) {
		String init_driver=prop.getProperty("browser");
		if(init_driver!=null)
			return;
		else
		
		throw new RuntimeException("browser not specified in config.properties file");

	}
	

	}
