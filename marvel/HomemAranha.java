package marvel;

import generics.Personagem;
import interfaces.regeneracao;

public class HomemAranha extends Personagem implements regeneracao {
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
        System.out.println(vida);
        if (super.getVida() <= 0.0) {
            regenerarVida();
        } else {
            super.setVida(vida);
        }
    }

    @Override
    public void regenerarVida() {
        System.out.println("Entrei");
        super.setVida(400);
    }
}