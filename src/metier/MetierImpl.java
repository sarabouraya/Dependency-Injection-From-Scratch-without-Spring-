package metier;

import doa.IDao;

public class MetierImpl implements IMetier{
	private IDao dao;
	
	public MetierImpl(IDao dao) {
		this.dao = dao;
	}

	@Override
	public double calcul() {
		double val = dao.getData()*Math.random();
		return val;
	}
	
	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public MetierImpl() {
		super();
	}
	
		
}
