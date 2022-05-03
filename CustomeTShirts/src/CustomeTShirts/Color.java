package CustomeTShirts;

public class Color {
	
	private final int NUM_COLORS = 3;
	private final static int MIN_COLOR = 0;
	public final static int MAX_COLOR = 255;
	private short red;
	private short green;
	private short blue;
	
	public Color() {
		this((short)MIN_COLOR,(short)MIN_COLOR,(short)MIN_COLOR);
	}
	
	
	public Color(short red, short green, short blue) {
		setBlue(blue);
		setGreen(green);
		setRed(red);
	}
	
	public Color(int red, int green, int blue) {
		this((short)red, (short)green, (short)blue);
	}

	public String getDominant() {
		short max = this.red;
		max = this.green > max ? this.green: max;
		max = this.blue > max ? this.blue: max;
		return "The name of the field with the highest value is: " + max;
	}

	public float[] normalized() {
		float[] rgbNormal = new float[NUM_COLORS];
		
		rgbNormal[0] = (float)this.red / MAX_COLOR;
		rgbNormal[1] = (float)this.green / MAX_COLOR;
		rgbNormal[2] = (float)this.blue / MAX_COLOR;
		
		return rgbNormal;
		
	}

	@Override
	public String toString() {
		return "Color [red=" + red + ", green=" + green + ", blue=" + blue + "]";
	}

	public short getRed() {
		return red;
	}

	public void setRed(short red) {
		if(Utils.isInRange(red, MIN_COLOR, MAX_COLOR))
			this.red = red;
	}

	public short getGreen() {
		return green;
	}

	public void setGreen(short green) {
		if(Utils.isInRange(green, MIN_COLOR, MAX_COLOR))
			this.green = green;
	}

	public short getBlue() {
		return blue;
	}

	public void setBlue(short blue) {
		if(Utils.isInRange(blue, MIN_COLOR, MAX_COLOR))
			this.blue = blue;
	}
	
	
	
}
