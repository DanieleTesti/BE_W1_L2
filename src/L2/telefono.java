package L2;

import java.util.*;

public class telefono {

	int tel;
	double credito=0;
	int[][] calls;
	
	
	
	public int getTelefono(){
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci il tuo numero");
		int n = s.nextInt();
		System.out.println("numero : "+n);
		return n;
	}
	
	public double getCredito() {
		System.out.println("Il tuo credito è :"+credito+" €");
		return credito;
	}
	
	public void numero() {
		//int [][] calls=new int[4][1];
		int [][] chiamate= {
				{457, 10},
				{458, 9},
				{465, 20},
				{478, 15},
				{445, 4}
		};
		for(int i=0;i<chiamate.length;i++) {
			System.out.print("Numero: ");
			for(int j=0;j<chiamate[i].length;j++) {
				System.out.print(chiamate[i][j]+" ");
			}
			System.out.println("minuti");
		}
		
	}
}


