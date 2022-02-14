package ext;

import doa.IDao;

public class Sensor implements IDao{

	@Override
	public double getData() {
		System.out.println("Version Capteur");
		Double val = 1.0;
		return val;
	}

}
