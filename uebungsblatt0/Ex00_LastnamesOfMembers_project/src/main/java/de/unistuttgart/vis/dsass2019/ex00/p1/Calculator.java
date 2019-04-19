package de.unistuttgart.vis.dsass2019.ex00.p1;

public class Calculator implements ICalculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	@Override
	public int quersumme(int a) {
		int sum = 0;
		while (a != 0) {
			sum += a % 10;
			a = a / 10;
		}
		return sum;
	}


}