package ex03;

public class NumRandom {
    public static void main(String[] args) {

        int numeroAleatorio = gerarNumeroAleatorio(1, 100);

        System.out.println("Número aleatório entre 1 e 100: " + numeroAleatorio);
    }

    public static int gerarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
