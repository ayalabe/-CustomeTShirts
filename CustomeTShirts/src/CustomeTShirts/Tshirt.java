package CustomeTShirts;

public class Tshirt {
	



	private Size size;
	private Design design;
	private static double MIN_DEMANDFACTOR = 0.1;
	private int MAX_DEMANDFACTOR = 1;
	private double demandFactor;
	private static int MIN_BASEPRICE = 3;
	private double basePrice;
	
	public Tshirt() {
		this(Size.M, new Design(), MIN_DEMANDFACTOR, MIN_BASEPRICE);
	}
	
	
	

	public Tshirt(Size size, Design design, double demandFactor, double basePrice) {
		this.size = size;
		setDesign(design);
		setDemandFactor(demandFactor);
		setBasePrice(basePrice);
	}

	public double calculateFinalPrice() {
		return (basePrice + design.getComplexity()) * design.calculateArea() / demandFactor;
	}
	
	public boolean isExpensive() {
		if(this.basePrice>=10000)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Tshirt [size=" + size + ", design=" + design + ", demandFactor=" + demandFactor + ", basePrice="
				+ basePrice + ", finalPrice=" + calculateFinalPrice() + "]";
	}


	public double getDemandFactor() {
		return demandFactor;
	}


	public void setDemandFactor(double demandFactor) {
		if(Utils.isInRange(demandFactor, MIN_DEMANDFACTOR, MAX_DEMANDFACTOR))
			this.demandFactor = demandFactor;
		else
			this.demandFactor = MIN_DEMANDFACTOR;
	}



	public void setBasePrice(double basePrice) {
		if(basePrice >= MIN_BASEPRICE)
			this.basePrice = basePrice;
		else 
			this.basePrice = MIN_BASEPRICE;
	}
	
	public Design getDesign() {
		return design;
	}


	public void setDesign(Design design) {
		if(design == null)
			this.design = new Design();
		else
			this.design = design;
	}

	public Size getSize() {
		return size;
	}




	public void setSize(Size size) {
		this.size = size;
	}




	public double getBasePrice() {
		return basePrice;
	}
	

}
