package de.unistuttgart.vis.dsass2019.ex01.p2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		System.out.println("test, hallo");
		SpeedList mylist = new SpeedList();
		
		System.out.println(mylist.size());

		
		mylist.prepend("einz");
		mylist.prepend("zwei");
		mylist.prepend("drei");
		mylist.prepend("vier");
		mylist.prepend("fünf");
		mylist.prepend("sechs");
		mylist.prepend("sieben");
		mylist.prepend("acht");
		mylist.prepend("neun");
		mylist.prepend("zehn");
		
		System.out.println(mylist.size());

				
		System.out.println();
		System.out.println(mylist.getElementAt(0));
		System.out.println(mylist.getNext8thElementOf(1));
		try {
			System.out.println(mylist.getElementAt(8));
			System.out.println(mylist.getNext8thElementOf(2));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Exc caught: " + e);
		}
		
		System.out.println("fertig");


	}

}
