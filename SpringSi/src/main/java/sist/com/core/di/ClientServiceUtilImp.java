package sist.com.core.di;

public class ClientServiceUtilImp  implements ServiceUtil{
private Dao dao; 




	
	public ClientServiceUtilImp() {
	super();
}

	public ClientServiceUtilImp(Dao dao) {
	super();
	this.dao = dao;
}

	public Dao getDao() {
	return dao;
}

public void setDao(Dao dao) {
	this.dao = dao;
}

	@Override
	public void fileCheck() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void validate() {
		// TODO Auto-generated method stub
		dao.delete();
		
	}

	
	
}
