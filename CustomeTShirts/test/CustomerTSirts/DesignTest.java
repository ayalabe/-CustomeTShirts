package CustomerTSirts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import CustomeTShirts.Color;
import CustomeTShirts.Design;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(Lifecycle.PER_CLASS)

class DesignTest {
	
	Design design = new Design();
	

	@Test
	void chekcFilde() {
//		assertEquals(new Color(),design.getColor());
		assertEquals(Design.MIN_COMPLEXITY,design.getComplexity());
		assertEquals(Design.MIN_HEIGHT,design.getHeight());
		assertEquals("",design.getSlogan());
		assertEquals(Design.MIN_WIDTH,design.getWidth());
		
	}
	
	@Test
	void chekcArea() {
		double area = design.getHeight() * design.getWidth();
		assertEquals(area,design.calculateArea());
		
	}
	

}
