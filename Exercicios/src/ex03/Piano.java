package ex03;

class Piano extends InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando piano...");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando piano...");
    }
}