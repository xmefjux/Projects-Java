package mypackage;

public class Gerbil {
	static int gerbilNumber;
	final int id = gerbilNumber++;
	public Gerbil() {
		// TODO Auto-generated constructor stub
	}
	void hop()
	{
		System.out.println("Gerbil no." + id() + " hop!");
	}
	int id() { return id; }
}
