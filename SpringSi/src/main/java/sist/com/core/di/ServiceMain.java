package sist.com.core.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ServiceMain {

	
	
	public static void main(String[] args) {
		ApplicationContext app= new FileSystemXmlApplicationContext("src/main/java/sist/com/core/di/service.xml");
		ServiceUtil serviceselect=(ServiceUtil)app.getBean("service2");
		
		serviceselect.fileCheck();
		
		
		
	}
	
}
