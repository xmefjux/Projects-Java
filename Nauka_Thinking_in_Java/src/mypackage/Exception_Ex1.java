package mypackage;

class MyEx1 extends Exception {
	public MyEx1() {}
	public MyEx1(String msg) { super(msg); }
}

public class Exception_Ex1 {
	
	private String _s;

	public Exception_Ex1(String s) {
		// TODO Auto-generated constructor stub
		_s = s;
	}
	
	void main_method() throws MyEx1 {
		System.out.println("Throwing MyEx1 "+_s);
		throw new MyEx1("my ex 1");
	}
	
	void another_method() throws NullPointerException {
		throw new NullPointerException("Caught null pointer");
	}
	
	void yet_another_method() throws Exception {
		throw new Exception("Exception caught!");
	}

}
