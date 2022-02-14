package presentation;

import doa.DoaImpl;
import doa.IDao;
import metier.MetierImpl;

public class Presentation1 {

	public static void main(String[] args) {
		// Injection par constructeur
		IDao dao = new DoaImpl();
		MetierImpl metier = new MetierImpl(dao);
		
		//		Injection par setter
//		MetierImpl metier = new MetierImpl();
//		IDao dao = new DoaImpl();
//		metier.setDao(dao);
		System.out.println("value = "+metier.calcul());
	}

}
