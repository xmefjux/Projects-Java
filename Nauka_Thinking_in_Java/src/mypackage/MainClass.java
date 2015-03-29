package mypackage;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ApplesAndOrangesWithGenerics();
		new GenericsAndUpcasting();
		
		ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
		gerbils.add(new Gerbil());
		gerbils.add(new Gerbil());
		for(Gerbil c : gerbils)
			c.hop();
		
		new PrintingContainers();
		new NameGenerator();
	}
}
