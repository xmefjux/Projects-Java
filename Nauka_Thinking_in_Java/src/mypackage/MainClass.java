package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new ApplesAndOrangesWithGenerics();
		//new GenericsAndUpcasting();
		
		//ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		//gerbils.add(new Gerbil());
		//gerbils.add(new Gerbil());
		//for(Gerbil c : gerbils)
		//	c.hop();
		
		//new PrintingContainers();
		//new NameGenerator();
		
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch(SimpleException e) {
			System.out.println("Caught it!");
		}
		
		new FullConstructors();
		
		Exception_Ex1 ex1 = new Exception_Ex1("New obj ex1");
		try {
			ex1.main_method();
		} catch (MyEx1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		} finally {
			System.out.println("We were in try catch");
		}
		
		Exception_Ex1 ex2 = null;
		
		try {
			ex2.another_method();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.out);
		}
		
		int array[] = { 1, 2, 3 };
		
		try {
			IndexOutOfBounds.generete_ex(array);
		} catch (IndexOutOfBoundsException e){
			e.printStackTrace(System.out);
		}
		while(true){
			try{
				Scanner in = new Scanner(System.in);
				int i = Integer.parseInt(in.nextLine());
				in.close();
				System.out.println("Got your int man, it's "+i);
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace(System.out);
			}
		}
		
		new LoggingExceptions();
		
	}
}
