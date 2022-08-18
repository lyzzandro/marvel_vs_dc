package generics;

public class Personagem {
    private double forca;
    private double vida;

    public Personagem(Double forca, double vida) {
        this.forca = forca;
        this.vida = vida;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getForca() {
        return forca;
    }

    public double getVida() {
        return vida;
    }
}
