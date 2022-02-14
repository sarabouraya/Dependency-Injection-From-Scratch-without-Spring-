package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import doa.IDao;
import metier.IMetier;

public class Presentation2 {

	public static void main(String[] args) throws Exception  {
		
		 File file = new File("src/config.txt");
		 Scanner scanner = new Scanner(file);
		 String line = scanner.nextLine();
		 Class cDao = Class.forName(line);
	     IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
	     

         String line1 = scanner.nextLine();
         Class cMetier = Class.forName(line1);
         IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();
         
         
         Method Method = cMetier.getMethod("setDao",IDao.class);
         Object obj = Method.invoke(metier,dao);
         
         System.out.println(metier.calcul());
       
//		 
		 
		 
		 // Permet de charger l'objet en Mémoire
//         Class cDao = Class.forName("doa.DoaImpl");
//         System.out.println(cDao);
//		 
//		 String line = scanner.nextLine();
//		 // Permet de charger l'objet en Mémoire
//		 Class cMetier = Class.forName(line);
		 
		 
		 
		 
	}

}
