package sist.com.core.di;

public class MyBatisDao implements Dao{
	private OpenSessionEx open;
	
	
	
	public MyBatisDao() {
		super();
	}

	public MyBatisDao(OpenSessionEx open) {
		super();
		this.open = open;
	}

	public OpenSessionEx getOpen() {
		return open;
	}

	public void setOpen(OpenSessionEx open) {
		this.open = open;
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		open.connection();
		System.out.println("MyBatisDaoSELECT");
	}

	
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		open.connection();
		System.out.println("myBatisUPDATE");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		open.connection();
		System.out.println("mybadel");
	}

	
}
