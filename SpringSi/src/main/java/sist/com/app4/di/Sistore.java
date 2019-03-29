package sist.com.app4.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sistore {
@Autowired		
private Product product;

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}



	


	
}
