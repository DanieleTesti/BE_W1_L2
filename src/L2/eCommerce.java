package BE_W1_L2.src.L2;

import java.util.Scanner;

public class eCommerce {
	
	private static Scanner s = new Scanner(System.in);
	String nome;
	String mail;
	int codC;
	
	public void Client() {
		this.codC=codCliente();
		System.out.println("Codice cliente : "+codC);
		this.nome=nome();
		System.out.println("Nome cliente : "+nome);
		this.mail=mail();
		System.out.println("Mail cliente : "+mail);
	}
	
	public int codCliente() {
		System.out.println("Inserisci il codice cliente");
		codC = s.nextInt();
		return codC;
	}
	public String nome() {
		System.out.println("Inserisci il nome");
		nome = s.next();
		return nome;
	}
	public String mail() {
		System.out.println("Inserisci la mail");
		mail = s.next();
		return mail;
	}
	public void dataIscr() {
		System.out.println("Inserisci la data di iscrizione");
		int date = s.nextInt();
	}
	
	public void codiceArt() {
		System.out.println("Inserisci il numero dell'articolo");
		int cod = s.nextInt();
	}
	public void description() {
		System.out.println("Inserisci la descrizione");
		String desc = s.nextLine();
	}
	public void prezzo() {
		System.out.println("Inserisci il prezzo");
		int price = s.nextInt();
	}
	public void nArt() {
		System.out.println("Inserisci il numero degli articoli in magazzino");
		int nArt = s.nextInt();
	}
	
}
