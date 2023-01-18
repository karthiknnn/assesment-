package sakshingpdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class propertyfile {
	public String gerPropertydata(String key) throws IOException 
	{
		
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(Autoconstant.propertyfilepath);
	p.load(fis);
	return p.getProperty(key);
	
		
	}

}
