package sist.com.app2.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class CarCenter {
private Car car;





public Car getCar() {
	return car;
}
@Required
@Autowired
@Qualifier(value="car1Q")
public void setCar(Car car) {
	this.car = car;
}
	
	

}
