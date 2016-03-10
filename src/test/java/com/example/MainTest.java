package com.example;

import org.junit.*;
import static org.junit.Assert.*;

public class MainTest {
	private Main main;
	
	@Test
	public void testDoSomething(){
		main = new Main();
		assertEquals(2, main.doSomething(1, 1));
	}

}
