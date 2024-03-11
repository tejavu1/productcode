package codefilepack;


import java.io.File;
import java.util.LinkedList;
import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;
import javax.security.auth.login.Configuration;

import org.apache.hc.core5.http.config.RegistryBuilder;

public class JVMReport {

	public static void main(String[] args) {
		
		String prop = System.getProperty("user.dir");
		System.out.println(prop);
	}
	
	
	public static  void generateJVMReport(String json) {
		
          File loc =new File(System.getProperty("user.dir")+"src\\test\\resources\\reports\\JVMReports");
      
          Configuration con ;
          
          List<String> jsonfiles=new LinkedList<String>();
          
          jsonfiles.add(json);
          
          ReportBuilder r=new ReportBuilder(jsonfiles,con);
          
          
	}}
