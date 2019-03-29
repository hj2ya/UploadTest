package sist.com.di;

public class Person {

	private String name;
	private String age;
	private String job;
	private String addr;
			

	public Person() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", job=" + job + ", addr=" + addr + "]";
	}

	
	
	
}
