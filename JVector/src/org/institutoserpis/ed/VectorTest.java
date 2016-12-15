package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;


public class VectorTest {

	@Test
	public void indexOf() {
		
		int[] v = new int[]{32, 15, 7, 9, 12};
		int item = 9;
		int index = Vector.indexOf(v, item);
		assertEquals(3, Vector.indexOf(new int[]{32, 15, 7, 9, 12}, 9));
	}
	
	
	@Test
	public void min(){
		assertEquals(7, Vector.min(new int[]{32,15,7,9,12}));
		assertEquals(1, Vector.min(new int[]{32,15,7,9,1}));
		assertEquals(32, Vector.min(new int[]{32,90,91,84,56}));
		assertEquals(0, Vector.min(new int[]{32,90,91,0,56}));
	}

}