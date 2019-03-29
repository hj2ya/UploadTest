package sist.com.core.di;

public class AdminServiceUtilImp  implements ServiceUtil{
	private Dao dao;
	
	
	


	

	public AdminServiceUtilImp() {
		super();
	}

	

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public AdminServiceUtilImp(Dao dao) {
		super();
		this.dao = dao;
	}

	
	@Override
	public void fileCheck() {		
		// TODO Auto-generated method stub
			dao.select();
			
		
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		
	}
		
		
	
		
}
