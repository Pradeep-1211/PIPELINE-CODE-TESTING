package mypkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {
	
	MyCalc calc = new MyCalc();

	@Test
	public void test() {
		
		assertEquals(30, calc.sum(20, 10));
		assertEquals(10, calc.diff(20, 10));
		assertEquals(200, calc.mul(20, 10));
		assertEquals(2, calc.div(20, 10));
	}

}
