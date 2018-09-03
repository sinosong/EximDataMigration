package com.brilliance.util;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.Properties;

public class LogUtil {

    public static synchronized Logger getLog(String className,String suffix,String date){

        Logger logger = Logger.getLogger(className);
        Properties props = new Properties();
        //props.setProperty("log4j.rootLogger", "DEBUG,console,file,errorfile");
        props.setProperty("log4j.rootLogger", "info,console,file,errorfile");
        props.setProperty("log4j.appender.console", "org.apache.log4j.ConsoleAppender");

        props.setProperty("log4j.appender.file", "org.apache.log4j.FileAppender");
        props.setProperty("log4j.appender.file.File", "log/" +date+ "/" + suffix +"_log.txt");

        props.setProperty("log4j.appender.errorfile", "org.apache.log4j.DailyRollingFileAppender");
        props.setProperty("log4j.appender.errorfile.File", "log/" +date+ "/" + "errorlog.txt");
        props.setProperty("log4j.appender.errorfile.threshold", "ERROR");


        props.setProperty("log4j.appender.console.layout", "org.apache.log4j.PatternLayout");
        props.setProperty("log4j.appender.console.layout.ConversionPattern", "%d{yyyy-MM-dd HH:mm:ss,SSS} %2p [%t] (%F:%L) - %m%n");

        props.setProperty("log4j.appender.file.layout", "org.apache.log4j.PatternLayout");
        props.setProperty("log4j.appender.file.layout.ConversionPattern", "%d{yyyy-MM-dd HH:mm:ss,SSS} %2p [%t] (%F:%L) - %m%n");

        props.setProperty("log4j.appender.errorfile.layout", "org.apache.log4j.PatternLayout");
        props.setProperty("log4j.appender.errorfile.layout.ConversionPattern", "%d{yyyy-MM-dd HH:mm:ss,SSS} %2p [%t] (%F:%L) - %m%n");

        PropertyConfigurator.configure(props);
        return logger;
    }

}
