
// U10111003 朱永捷

public class Compute {
	// Define data fields
	private double x;
	private int com = 0;
	
	// No-argument constructor
	public Compute(){
	}

	// Constructor the specified id and initial balance
	public Compute(String newX){
		setX(newX);
	}


	// Mutator methods
	public void setX(String newX){
		x = Double.parseDouble(newX);
	}
	public void setCom(int newCom){
		com = newCom;
	}

	// add method
	public double add(double newY) { 
		double y = newY;
		x += y;
		return x;
	}

	// minus method
	public double minus(double newY) { 
		double y = newY;
		x -= y;
		return x;
	}

	// multiply method
	public double multiply(double newY) { 
		double y = newY;
		x *= y;
		return x;
	}

	// divide method
	public double divide(double newY) { 
		double y = newY;
		x /= y;
		return x;
	}

	// compare method (add,minus,multiply,divide)
	public double compare(double newY) {
		double result = 0;
		if (com == 0) {
			result = add(newY);
		} else if (com == 1) {
			result = minus(newY);
		} else if (com == 2) {
			result = multiply(newY);
		} else if (com == 3) {
			result = divide(newY);
		}
		return result;
	}
}
