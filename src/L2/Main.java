package L2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prodotto p1= new prodotto();
		prodotto p2= new prodotto();
		p1.setPrice(10);
		System.out.println(p1.getPrice());
		System.out.println(p2.getPrice());
		System.out.println(p1.priceChanged);
		System.out.println(p2.priceChanged);
		
	}


}
