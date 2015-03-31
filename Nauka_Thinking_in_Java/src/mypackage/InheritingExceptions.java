package mypackage;

class SimpleException extends Exception {}

public class InheritingExceptions {
	
	public void f() throws SimpleException {
			System.out.println("Throw SimpleException from f()");
			throw new SimpleException();
		}
	public InheritingExceptions() {
		// TODO Auto-generated constructor stub
		
	}

}
