package sist.com.app4.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value="singleton")
public class Product {
@Value(value="µþ±â")
private String ProductName;
@Value(value="µþ±â")
private String ProductOrigin;
@Value(value="µþ±â")
private String ProductInput;
@Value(value="5000")
private int ProductPrice;





public Product() {
	super();
}
public Product(String productName, String productOrigin, String productInput, int productPrice) {
	super();
	ProductName = productName;
	ProductOrigin = productOrigin;
	ProductInput = productInput;
	ProductPrice = productPrice;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public String getProductOrigin() {
	return ProductOrigin;
}
public void setProductOrigin(String productOrigin) {
	ProductOrigin = productOrigin;
}
public String getProductInput() {
	return ProductInput;
}
public void setProductInput(String productInput) {
	ProductInput = productInput;
}
public int getProductPrice() {
	return ProductPrice;
}
public void setProductPrice(int productPrice) {
	ProductPrice = productPrice;
}
@Override
public String toString() {
	return "Product [ProductName=" + ProductName + ", ProductOrigin=" + ProductOrigin + ", ProductInput=" + ProductInput
			+ ", ProductPrice=" + ProductPrice + "]";
}

	
	
}
