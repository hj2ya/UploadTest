package sist.com.app1.di;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	private String regdate;
	private String isBn;
	

	public Book() {
		super();
		
	}
public void selectSecondBook(){
	System.out.println("selectSecondBook");
}

public void selectBook(){//생성되고 호출되어짐 xml init 메소드  prototype=get Bean할때 불려짐
	System.out.println("selectBook");
	
}


	public Book(String title, String author, int price, String publisher, String regdate, String isBn) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.regdate = regdate;
		this.isBn = isBn;
	}





	public String getTitle() {
		return title;
	}





	public void setTitle(String title) {
		this.title = title;
	}





	public String getAuthor() {
		return author;
	}





	public void setAuthor(String author) {
		this.author = author;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public String getPublisher() {
		return publisher;
	}





	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}





	public String getRegdate() {
		return regdate;
	}





	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}





	public String getIsBn() {
		return isBn;
	}





	public void setIsBn(String isBn) {
		this.isBn = isBn;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", regdate=" + regdate + ", isBn=" + isBn + "]";
	}
	
	
	
	
}
