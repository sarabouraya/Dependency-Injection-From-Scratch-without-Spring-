package doa;

public class DoaImpl implements IDao {

	
	@Override
	public double getData() {
		System.out.println("Version base de donn�es ");
		Double data = Math.random()*10;
		return data;
	}

	public DoaImpl() {
		super();
	}
	
	
}
