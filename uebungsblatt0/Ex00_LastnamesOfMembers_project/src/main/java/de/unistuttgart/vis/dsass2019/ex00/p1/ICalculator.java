package de.unistuttgart.vis.dsass2019.ex00.p1;

public interface ICalculator {

	/** Returns a+b */
	public int add(int a, int b);
	/** Returns a-b */
	public int subtract(int a, int b);
	/** Returns a*b */
	public int multiply(int a, int b);
	/** Returns maximum of a and b */
	public int max(int a, int b);
	/** Calculate Quersumme */
	public int quersumme(int a);

}
