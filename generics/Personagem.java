package generics;

/**
 * Personagem
 */
public class Personagem {
    private int forca;
    private int vida;
    private int ultimate;

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setUltimate(int ultimate) {
        this.ultimate = ultimate;
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

    public int getUltimate() {
        return ultimate;
    }

}