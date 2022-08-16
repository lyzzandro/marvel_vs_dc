package generics;

public class Batalha {

    /* Batalhando os heróis */
    public static void batalhar(Personagem heroi1, Personagem heroi2) {
        while (heroi1.getVida() > 0 || heroi2.getVida() > 0) {
            ataque(heroi1, heroi2);
            ataque(heroi2, heroi1);
        }

        fimBatalha(heroi1, heroi2);
    }

    /* Método pra atacar */
    private static int ataque(Personagem heroiAtacante, Personagem defensor) {
        defensor.setVida(defensor.getVida() - heroiAtacante.getForca());
        return 0;
    }

    /* Imprimindo herói que venceu a batalha */
    private static void fimBatalha(Personagem heroi1, Personagem heroi2) {
        if (heroi1.getVida() <= 0) {
            System.out.println(heroi1.toString() + " venceu a batalha");
        } else {
            System.out.println(heroi2.toString() + " venceu a batalha");
        }
    }
}
