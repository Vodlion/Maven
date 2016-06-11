package org.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DAOHelloWorldTest {

	private DAOHelloWorld dao;
	
	@Before
	public void setUp() throws Exception {
		dao = DAOHelloWorld.getInstance();
	}

	@Test
	public void testGetInstance() {
		assertEquals(DAOHelloWorld.getInstance(), dao);
	}

	@Test
	public void testGetQuerySelectFirstHelloWorld() {
		assertEquals("Hello world!", dao.getQuerySelectFirstHelloWorld());
	}

}
