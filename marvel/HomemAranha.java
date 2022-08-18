package marvel;

import generics.Heroi;
import interfaces.regeneracao;

public class HomemAranha extends Heroi implements regeneracao {
    String nome = "Homem Aranha";

    @Override
    public String toString() {
        return nome;
    }

    public HomemAranha(double forca, double vida) {
        super(forca, vida);
    }

    @Override
    public void setVida(double vida) {
        this.regenerarVida(vida);
    }

    @Override
    public void regenerarVida(double vida) {
        super.setVida(Math.round(vida * 1.05));
    }
}