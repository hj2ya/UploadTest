package sist.com.core.di;

public class jdbcDao implements Dao{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
		System.out.println("jdbcDaoSelect");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("jdbcDaoUPDATE");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("jdbcdel");
	}

	
}
