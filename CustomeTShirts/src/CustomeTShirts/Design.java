package CustomeTShirts;

public class Design {
	
	public final static int MIN_WIDTH = 20;
	private final int MAX_WIDTH = 30;
	public final static int MIN_HEIGHT = 10;
	private final int MAX_HEIGHT = 25;
	public final static int MIN_COMPLEXITY = 1;
	private final int MAX_COMPLEXITY = 100;
	private double width;
	private double height;
	private String slogan;
	private Color color;
	private double complexity;
	
	public Design() {
		this(MIN_WIDTH,MIN_HEIGHT,"",new Color(),MIN_COMPLEXITY);
	}
	

	public Design(double width, double height, String slogan, Color color, double complexity) {
		setWidth(width);
		setHeight(height);
		setSlogan(slogan);
		setColor(color);
		setComplexity(complexity);
	}




	public double calculateArea() {
		return this.width * this.height;
	}

	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if(Utils.isInRange(width, MIN_WIDTH, MAX_WIDTH))
			this.width = width;
		else this.width = MIN_WIDTH;
	}

	public double getHeight() {
		return height;
	}




	public void setHeight(double height) {
		if(Utils.isInRange(height, MIN_WIDTH, MAX_WIDTH))
			this.height = height;
		else this.height = MIN_HEIGHT;
	}




	public String getSlogan() {
		return slogan;
	}


	public void setSlogan(String slogan) {
		if(Utils.isLetterDigits(slogan))
			this.slogan = slogan;
	}




	public double getComplexity() {
		return complexity;
	}




	public void setComplexity(double complexity) {
		if(Utils.isInRange(complexity, MIN_COMPLEXITY, MAX_COMPLEXITY))
			this.complexity = complexity;
		else this.complexity = MIN_COMPLEXITY;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		if(color == null)
			this.color = new Color();
		else
			this.color = color;
	}

	@Override
	public String toString() {
		return "Design [width=" + width + ", height=" + height + ", slogan=" + slogan + ", color=" + color
				+ ", complexity=" + complexity + "]";
	}

	
}
