package sist.com.app2.di;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class CarCenter2 {
@Autowired
private List<Car>list;


public List<Car> getList() {
	return list;
}

public void setList(List<Car> list) {
	this.list = list;
}
	

}
