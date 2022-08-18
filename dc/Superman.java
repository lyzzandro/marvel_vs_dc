package dc;

import generics.Heroi;
import interfaces.superforca;

public class Superman extends Heroi implements superforca {
    String nome = "Superman";

    @Override
    public String toString() {
        return nome;
    }

    public Superman(double forca, double vida) {
        super(forca, vida);
        aumentarForca();
    }

    @Override
    public void aumentarForca() {
        super.setForca(super.getForca() * 1.15);
    }
}
