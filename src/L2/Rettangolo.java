package L2;

public class Rettangolo {
	
	int h, b;
	public Rettangolo(int h, int b) {
		this.h=h;
		this.b=b;
	}
	
	public int getPerimetro() {
		int p=((b+h)*2);
		return p;
	}
	public int getArea() {
		int a =b*h;
		return a;
	}
}