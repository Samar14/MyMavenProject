package ProportiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import fourstay.utilities.Config;

public class ReadPropertiesFile {
	public static void main(String[] args) throws IOException {
		
		System.out.println(Config.getProperty("url"));
		
//		String path="./src/test/resources/TestData/configuration.proporties";
//		FileInputStream input=new FileInputStream(path);
//		
//		Properties configFile=new Properties();
//		configFile.load(input);
//		
//		System.out.println(configFile.getProperty("state"));
//		System.out.println(configFile.getProperty("language"));
//		
//		input.close();
		
	}

}
