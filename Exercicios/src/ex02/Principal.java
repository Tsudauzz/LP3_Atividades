package ex02;

public class Principal {
	public static void main(String[] args) {
		Planta planta = new Planta();
		Flor flor = new Flor();
		Arvore arvore = new Arvore();
		
		planta.fotossintese(); 
        flor.fotossintese();   
        arvore.fotossintese();
	}
}
