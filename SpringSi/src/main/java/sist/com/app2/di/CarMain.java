package sist.com.app2.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CarMain {

	
	
	public static void main(String[] args) {
		ApplicationContext app= new FileSystemXmlApplicationContext("src/main/java/sist/com/app2/di/car.xml");
		
		/*CarCenter carCenter= (CarCenter)app.getBean("carcenter");
		System.out.println(carCenter.getCar().getSpeed());*/
		
		CarCenter2 carCenter2= (CarCenter2)app.getBean("carcenter2");
		System.out.println(carCenter2.getList().get(0).getCarPrice());
			
		
		
	}
}
