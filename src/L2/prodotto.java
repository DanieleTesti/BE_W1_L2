package BE_W1_L2.src.L2;

public class prodotto {

	private double price=20;
	private String[] nome;
	//con static lo condivide a  tutte le proprietà
	int priceChanged=0;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double p) {
		priceChanged++;
		price=p;
	}

}
