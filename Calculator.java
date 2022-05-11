package week1.day2;

public class Calculator {
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);		
	}

	public void sub(int a, int b) {
		int c = a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(10, 20);
		calc.sub(30, 10);
	}
}
