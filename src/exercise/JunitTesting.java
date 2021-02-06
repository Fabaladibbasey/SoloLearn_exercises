package exercise;

public class JunitTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculators calculator = new Calculators();
		int result = calculator.addition(2, 3);
		System.out.println("This is the result of your addition! " + result);
	}

}

class Calculators {
	int addition (int a, int b){
		return a + b;
	}
}