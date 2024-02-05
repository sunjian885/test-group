package com.common.performance.utils;

import com.common.autotest.utils.ConfigProperty;
import com.mysql.jdbc.StringUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContext {


    private static String getXmlFile(String xmlFile) {
        if (xmlFile.toLowerCase().endsWith(".xml")) {
            xmlFile = xmlFile.substring(0, xmlFile.length() - 4);

            String runmode = ConfigProperty.get("runmode");
            if(!StringUtils.isNullOrEmpty(runmode)){
                xmlFile = xmlFile + "_"+runmode.toUpperCase()+".xml";
            }else{
                System.out.println("Warning: src/test/resources/config.properties文件中的 runmode值不能为空.");
                xmlFile = xmlFile + ".xml";
            }
        } else {
            System.err.println("XML 文件名称错误.");
        }

        return xmlFile;
    }

    /*
     * 约定:xmlFile必须放到src/test/resources/META-INF/spring目录下
     */
    public static ClassPathXmlApplicationContext loadClassPathXmlFile(String xmlFile) {
        //根据config.properties来拼xmlFile全路径
        xmlFile = getXmlFile(xmlFile);
        String tempXmlFile = "classpath:META-INF/spring/" + xmlFile;
        System.out.println("XmlPath: "+tempXmlFile);
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                tempXmlFile);
        appContext.start();
        return appContext;
    }

    /*
     * xmlPath示例: META-INF/spring/user-service-consumer.xml
     */
    public static ClassPathXmlApplicationContext loadClassPathXmlPath(String xmlPath) {
        //根据config.properties来拼xmlFile全路径
        xmlPath = getXmlFile(xmlPath);
        String tempXmlFile = "classpath:" + xmlPath;
        System.out.println("XmlPath: "+tempXmlFile);
        //ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(tempXmlFile);
        //appContext.start();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        System.out.println("ClassPathXmlApplicationContext1: "+context);
        context.setConfigLocation(tempXmlFile);
        System.out.println("ClassPathXmlApplicationContext2: "+context);
        context.refresh();
        System.out.println("ClassPathXmlApplicationContext3: "+context);
        return context;
    }

    /*
     * 支持正则：如*.xml
     */
//	public static ClassPathXmlApplicationContext loadClassPathXmlFile(String xmlFile) {
//		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
//				"classpath:META-INF/spring/" + xmlFile);
//		appContext.start();
//		return appContext;
//	}
}
