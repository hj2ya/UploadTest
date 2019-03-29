package sist.com.di;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainDi {
		
	public static void main(String[] args) {
		
		ApplicationContext app= new FileSystemXmlApplicationContext("src/main/java/sist/com/di/memberbean.xml");//xml을 읽어들임
			
			//List<Member>list=((BongBand)app.getBean("bongBand")).getList();
			Set<Member>set=((BongBand)app.getBean("bongBand")).getSet();	//set은 중복안됌
			Map<Integer, Member>map=((BongBand)app.getBean("bongBand")).getMap();
			Iterator<Entry<Integer, Member>>i=map.entrySet().iterator();
			
			for(;i.hasNext();){
				Entry<Integer, Member>entry=i.next();
				System.out.println("key="+entry.getKey()+"value="+entry.getValue());
			}
			
			
			//System.out.println(map.get(3));
			
			
			/*Iterator<Member>iter=set.iterator();
			
			while(iter.hasNext()){
				System.out.println(iter.next());				
			}*/
									
			/*for(Member m:list){
				System.out.println(m);
			}*/
			
			/*Member m1=(Member)app.getBean("member1");
			
			Member m2=(Member)app.getBean("member2");
				m1.setHit(50000);
				
				m2.setHit(100000);
				System.out.println(m1);
			
				System.out.println(m2);
				
				
			
			System.out.println(m2==(Member)app.getBean("member2"));
			
			m2=(Member)app.getBean("member2");
			System.out.println(m2);
			
			
		
			Person person=(Person)app.getBean("person1");
			System.out.println(person.toString());*/
		
	}
	
}
