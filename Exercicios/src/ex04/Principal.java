package ex04;

public class Principal {
	public static void main(String[] args) {
		
		Televisao minhaTv = new Televisao();
		Computador meuPc = new Computador();
		
		minhaTv.ligar();
		minhaTv.desligar();
		
		meuPc.ligar();
		meuPc.desligar();
	}
}
