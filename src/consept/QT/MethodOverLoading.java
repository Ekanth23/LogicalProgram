package consept.QT;

class Calculator {

    // Method 1: Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values
    double add(double a, double b) {
        return a + b;
    }
}


	public class MethodOverLoading {
	    public static void main(String[] args) {
	    	Calculator calc = new Calculator();

	        System.out.println("Sum of 2 numbers: " + calc.add(10, 20));
	        System.out.println("Sum of 3 numbers: " + calc.add(10, 20, 30));
	        System.out.println("Sum of double values: " + calc.add(5.5, 4.5));
	    }
	}


	
