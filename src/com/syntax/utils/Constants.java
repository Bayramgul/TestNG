package com.syntax.utils;

public class Constants {

	//first we are creating constants for the path for chrome and gecko driver,and path for configuration file
public static final  String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"/drivers/chromedriver 3";
public static final  String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"/drivers/geckodriver 2";
public static final  String CONFIGURATION_FILEPATH=System.getProperty("user.dir")+"/config/privateinfo.properties";
public static final  int IMPLICIT_WAIT_TIME=15;
public static final int EXPLICIT_WAIT_TIME=25;


}
