package sist.com.app3.di;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.swing.text.html.parser.Entity;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import sist.com.di.Member;

public class Main {

	
	public static void main(String[] args) {
		ApplicationContext app= new FileSystemXmlApplicationContext("src/main/java/sist/com/app3/di/com.xml");
		
		Map<Integer, Computer>map=((Store)app.getBean("store")).getMap();
		Iterator<Entry<Integer, Computer>>i=map.entrySet().iterator();
		
		Properties properties=((Store)app.getBean("store")).getProperties();
		
Iterator<Entry<Object, Object>>ite=properties.entrySet().iterator();
		
		while(ite.hasNext()){
			Entry<Object, Object>entry=ite.next();
			System.out.println("key="+entry.getKey()+" value="+entry.getValue().toString().toUpperCase());
		}
		
		
		//Iterator<Object>it=properties.keySet().iterator();
		
		/*for(;it.hasNext();){
			System.out.println(it.next());			
		}*/
		
		Enumeration<Object>en=properties.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		
		for(;i.hasNext();){
			Entry<Integer, Computer>entry=i.next();
			System.out.println("key="+entry.getKey()+"value="+entry.getValue());
		}
		

		
	}
	
}
