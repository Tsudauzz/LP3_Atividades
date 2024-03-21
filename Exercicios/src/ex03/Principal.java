package ex03;

public class Principal {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        p1.afinar();
        p1.tocar();
        
        p1.setMusica("Chico Boarque");
        p1.tocarMusica();
        
        Violao v1 = new Violao();
        v1.afinar();
        v1.tocar();
        
        v1.setMusica("Teste");
        v1.tocarMusica();
    }
}

