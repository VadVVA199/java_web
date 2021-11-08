package myfirstprogram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
@Test
	public void testArea() {
		int a = 25; 
		Square s = new Square(5);
	 	Assert.assertEquals(s.area(), a);
	}
}
