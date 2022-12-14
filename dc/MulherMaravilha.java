package dc;

import generics.Heroi;
import interfaces.superforca;

public class MulherMaravilha extends Heroi implements superforca {
    String nome = "Mulher Maravilha";

    @Override
    public String toString() {
        return nome;
    }

    public MulherMaravilha(double forca, double vida) {
        super(forca, vida);
        aumentarForca();
    }

    @Override
    public void aumentarForca() {
        super.setForca(super.getForca() * 1.10);
    }
}
