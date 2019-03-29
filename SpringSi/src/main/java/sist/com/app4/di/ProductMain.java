package sist.com.app4.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ProductMain {
	public static void main(String[] args) {
		
		ApplicationContext app= new FileSystemXmlApplicationContext("src/main/java/sist/com/app4/di/product.xml");
		/*Product product=(Product)app.getBean("product");  //첫글자 소문자로써야함
		System.out.println(product);*/
		Sistore siStore=(Sistore)app.getBean("sistore");
		System.out.println(siStore);
		
		
	}
	
	
}
