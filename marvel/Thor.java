package marvel;

import generics.Heroi;
import interfaces.superforca;

public class Thor extends Heroi implements superforca {
    String nome = "Thor";

    @Override
    public String toString() {
        return nome;
    }

    public Thor(double forca, double vida) {
        super(forca, vida);
    }

    @Override
    public void aumentarForca() {
        super.setForca(super.getForca() * 1.10);
    }
}