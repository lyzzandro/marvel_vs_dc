package generics;

/**
 * Personagem
 */
public class Personagem {
    private int forca;
    private int vida;

    public Personagem(int forca, int vida) {
        this.forca = forca;
        this.vida = vida;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public int getVida() {
        return vida;
    }

}