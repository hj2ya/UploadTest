package sist.com.app3.di;

import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;



public class Store {
	
	
private Map<Integer, Computer>map;
private Properties properties;  //map�� ���, ���ڿ������ö� �����ϰԾ���



public Map<Integer, Computer> getMap() {
	return map;
}

@Resource(name="map1")
public void setMap(Map<Integer, Computer> map) {
	this.map = map;
}
public Properties getProperties() {
	return properties;
}
@Resource(name="pro")
public void setProperties(Properties properties) {
	this.properties = properties;
}



}
