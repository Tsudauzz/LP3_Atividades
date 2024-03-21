package ex03;


abstract class InstrumentoMusical {
    private String musica;

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void tocarMusica() {
        if (musica != null && !musica.isEmpty()) {
            System.out.println("Tocando a música: " + musica);
        } else {
            System.out.println("Nenhuma música definida para este instrumento.");
        }
    }

    public abstract void tocar();
    public abstract void afinar();
}