package sist.com.app1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class AppBook1 {
	
	private Book book;
	private Book book2;
	System.out.print("하이");

	
	public AppBook1() {
		super();
	}
	public AppBook1(Book book) {
		super();
		this.book = book;
	}
	public Book getBook() {
		return book;
	}
	

	public Book getBook2() {
		return book2;
	}
	public void setBook2(Book book2) {
		this.book2 = book2;
	}
	
	@Required// 클래스와 book,2와묶어줌
	@Autowired   //자동으로
	public void setBook( @Qualifier(value="book1Q")Book book, @Qualifier(value="book2Q")Book book2) {
		this.book = book;
		this.book2=book2;
	}
	
	

}
