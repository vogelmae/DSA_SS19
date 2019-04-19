package de.unistuttgart.vis.dsass2019.ex01.p2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {

	@Test
	public void test() {
		System.out.println("test, hallo");
		SpeedList mylist = new SpeedList();
		mylist.prepend("einz");
		mylist.prepend("zwei");
		mylist.prepend("drei");
		mylist.prepend("vier");
		
		System.out.println(mylist.size());

		
		System.out.println("weiter gehts");
		mylist.printAll(4);
		
		System.out.println(mylist.getElementAt(0));
		System.out.println(mylist.getElementAt(1));
		//System.out.println(mylist.getElementAt(2));
		//System.out.println(mylist.getElementAt(3));


	}

}
