package org.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ModelTest {

	private Model model;
	
	@Before
	public void setUp() throws Exception {
		this.model = new Model();
	}

	@Test
	public void test() {
		assertEquals("Hello world!", this.model.getHelloWorld());
	}

}
