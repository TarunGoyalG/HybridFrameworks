package UTILITIES;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties p;
public ReadConfig()  {
	File f=new File("./Configuration/config.properties");
	
	try {	FileInputStream fa=new  FileInputStream(f);
 p=new Properties();
	p.load(fa);	}catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
}
public String geturl() {
	String m=p.getProperty("baseurl");
	return m;
}
public String getuser() {
	String m=p.getProperty("user");
	return m;
}
public String getpass() {
	String m=p.getProperty("pass");
	return m;
}


}
