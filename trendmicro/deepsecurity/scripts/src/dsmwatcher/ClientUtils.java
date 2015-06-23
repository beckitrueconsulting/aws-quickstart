// Copyright (c) Trend Micro Inc. 2004-2012, All Rights Reserved

package dsmwatcher;


import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.regions.Regions;
import com.trendmicro.webserviceclient.generated.Manager;
import com.trendmicro.webserviceclient.generated.ManagerService;
import com.trendmicro.webserviceclient.generated.ManagerServiceLocator;

/**
 * ClientUtils: This class is designed to keep basic info and common utility functions
 * used by the Deep Security WebService client sample applications.
 */
public class ClientUtils {
	public ManagerService _Service = new ManagerServiceLocator();
	public Manager _ManagerService = null;

	public static String dsmREST;
	public static String dsmSOAP;
	public static String dsmUser;
	public static String dsmPass;
	public static String dsmIP;
	public static String exemptTag;
	public static String exemptTagValue;
	public static Boolean requireFW;
	public static Boolean requireDPI;
	public static Boolean requireFIM;
	public static Boolean requireAV;
	public static Boolean requireLog;
	public static Boolean enableIsolation;
	public static String[] IRSubnets;
	public static String IRSecGrp;
	public static String denyAllSG;
	public static String avOn = "Anti-Malware: On";
	public static String fwOn = "Firewall: On";
	public static String fimOn = "Integrity Monitoring: On";
	public static String dpiOnPrevent = "Intrusion Prevention: On, Prevent";
	public static String dpiOnDetect = "Intrusion Prevention: On, Detect";
	public static String dpiOn;
	public static String logOn = "Log Inspection: On";
	public static String topicARN;
	public static Regions region;
	public static ArrayList<String> notifiedInstances = new ArrayList<String>();
	FileHandler fh;  
	Logger logger = Logger.getLogger("DSMWatcher");
    
	public ClientUtils() throws Exception {
		
		try {  
	        fh = new FileHandler("/root/dsmwatcher.log");  
	        logger.addHandler(fh);
	        SimpleFormatter formatter = new SimpleFormatter();  
	        fh.setFormatter(formatter);   
	        logger.info("DSMWatcher Started");  

	    } catch (SecurityException e) {  
	        e.printStackTrace();  
	    } 
		loadProps();

	}

	public void loadProps() throws Exception {
		Properties properties = new Properties();
		InputStream input = null;
		String conBool;
		try {
			input = new FileInputStream("/root/.dsmwatcher.props");
			properties.load(input);
			dsmREST=properties.getProperty("DSMURL")+"/rest";
			dsmSOAP=properties.getProperty("DSMURL")+"/webservice/Manager";
			dsmUser=properties.getProperty("DSMUSER");
			dsmIP=properties.getProperty("DSMIP");
			dsmPass=properties.getProperty("DSMPASS");
			IRSubnets = properties.getProperty("IRSUBNETS").split(",");
			IRSecGrp = properties.getProperty("IRSG");
			denyAllSG = properties.getProperty("DENYALLSG");
			exemptTag = properties.getProperty("EXEMPTTAG");
			exemptTagValue = properties.getProperty("EXEMPTTAGVALUE");
			topicARN = properties.getProperty("SNSTOPIC");
			conBool = properties.getProperty("ENFORCE");			
			if (conBool.equals("Y"))
				enableIsolation = true;
			else enableIsolation = false;
			conBool = properties.getProperty("REQFW");
			if (conBool.equals("Y"))
				requireFW = true;
			else requireFW = false;
			conBool = properties.getProperty("REQDPI");
			if (conBool.equals("Y"))
				requireDPI = true;
			else requireDPI = false;
			conBool = properties.getProperty("REQAV");
			if (conBool.equals("Y"))
				requireAV = true;
			else requireAV = false;
			conBool = properties.getProperty("REQFIM");
			if (conBool.equals("Y"))
				requireFIM = true;
			else requireFIM = false;
			conBool = properties.getProperty("REQLOG");
			if (conBool.equals("Y"))
				requireLog = true;
			else requireLog = false;
			conBool = properties.getProperty("DPIPROTECT");
			if (conBool.equals("Y"))
				dpiOn = dpiOnPrevent;
			else dpiOn = dpiOnDetect;
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		input.close();
		
		
	}
	public String getREST() throws Exception {
		return dsmREST;
	}
	
	
	public void log(String output) {
		System.out.println(output);
		
	    logger.info(output);  
	   

	}
	public void error(String output) {		
	    logger.severe(output);  
	  
	}
	

	

	public boolean testForId(String identifier) {
		try {
			Integer.parseInt(identifier);
			return true;
		} catch(NumberFormatException ne) {
			return false;
		}
	}


}