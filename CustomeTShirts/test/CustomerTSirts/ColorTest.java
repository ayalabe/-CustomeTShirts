package CustomerTSirts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import CustomeTShirts.Color;

@TestInstance(Lifecycle.PER_METHOD)

class ColorTest {
	
	Color[] colors = new Color[3];
	
	
	public ColorTest() {
		colors[0] = new Color(50,50,50);
		colors[1] = new Color(60,50,30);
		colors[2] = new Color(-50,200,50);
	}

	@Test
	void checkArr() {
		assertNotNull(colors);
	}
	
	@Test
	void checkEqulsArr() {
		for (int i = 0; i < colors.length; i++) {
			assertEquals(colors[0].getRed(),50);
			assertEquals(colors[0].getGreen(),50);
			assertEquals(colors[0].getBlue(),50);
			
		}
		
	}
	
	@Test
	void checkArrNormal() {
		float[] arr = new float[3];
		float MAX = 255;
		for (int i = 0; i < colors.length; i++) {
			arr[0] = colors[i].getRed()/MAX;
			arr[1] = colors[i].getGreen()/MAX;
			arr[2] = colors[i].getBlue()/MAX;
			assertArrayEquals(arr,colors[i].normalized());
		}
		
	}
	

}
