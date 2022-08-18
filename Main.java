import java.util.Scanner;

import dc.Batman;
import dc.Flash;
import dc.MulherMaravilha;
import dc.Superman;
import generics.Batalha;
import generics.Personagem;
import marvel.HomemDeFerro;
import marvel.HomemAranha;
import marvel.Hulk;
import marvel.Thor;

public class Main {

    public static void main(String[] args) {
        /* Criando vetor para adicionar os personagens */
        Personagem herois[] = new Personagem[2];

        /*
         * (HERÓI 1) Mostrando lista de herois, instanciando e adicionando no vetor de
         * herois(POSICAO 0)
         */
        Scanner heroi1 = new Scanner(System.in);
        int numeroHeroi1;
        imprimirListaDeHerois();
        numeroHeroi1 = heroi1.nextInt();
        escolherHerois(numeroHeroi1, 0, herois);

        /*
         * (HERÓI 2) Mostrando lista de herois, instanciando e adicionando no vetor de
         * herois(POSICAO 1)
         */
        Scanner heroi2 = new Scanner(System.in);
        int numeroHeroi2;
        imprimirListaDeHerois();
        numeroHeroi2 = heroi2.nextInt();
        escolherHerois(numeroHeroi2, 1, herois);

        System.out.println("--------------------------------------------------");

        /* Informando qual herói começa a batalha */
        Scanner heroiInicialScanner = new Scanner(System.in);
        int heroiInicial;
        System.out.println("Escolha o heroi que iniciara a batalha");
        System.out.println("1 - " + herois[0].toString() + "\n2 - " + herois[1].toString());

        System.out.printf("Informe um numero: ");
        heroiInicial = heroiInicialScanner.nextInt();

        if (heroiInicial == 1) {
            Batalha.batalhar(herois[0], herois[1]);
        } else if (heroiInicial == 2) {
            Batalha.batalhar(herois[1], herois[0]);
        } else {
            System.out.println("O heroi informado nao existe, entao iniciaremos com o primeiro heroi");
            Batalha.batalhar(herois[0], herois[1]);
        }

        /* Fechamento dos Scanners */
        heroi1.close();
        heroi2.close();
        heroiInicialScanner.close();
    }

    /* Método para imprimir lista de heróis */
    public static void imprimirListaDeHerois() {
        System.out.println(
                "---------------------------------------\nEscolha algum dos herois listados e digite o numero correspondente:");
        System.out.println(
                "1 - Batman\n2 - Homem Aranha\n3 - Homem de Ferro\n4 - Mulher Maravilha\n5 - Thor\n6 - Superman\n7 - Hulk\n8 - Flash\n---------------------------------------\n");

        System.out.printf("Informe um numero: ");
    }

    /* Método para escolher herói */
    public static void escolherHerois(int numeroHeroi, int numVetor, Personagem herois[]) {
        switch (numeroHeroi) {
            case 1:
                Personagem batman = new Batman(100, 1000);
                herois[numVetor] = batman;
                break;
            case 2:
                Personagem homemAranha = new HomemAranha(120, 900);
                herois[numVetor] = homemAranha;
                break;
            case 3:
                Personagem homemDeFerro = new HomemDeFerro(100, 1200);
                herois[numVetor] = homemDeFerro;
                break;
            case 4:
                Personagem mulherMaravilha = new MulherMaravilha(180, 1000);
                herois[numVetor] = mulherMaravilha;
                break;
            case 5:
                Personagem thor = new Thor(150, 1100);
                herois[numVetor] = thor;
                break;
            case 6:
                Personagem superman = new Superman(150, 1200);
                herois[numVetor] = superman;
                break;
            case 7:
                Personagem hulk = new Hulk(180, 1200);
                herois[numVetor] = hulk;
                break;
            case 8:
                Personagem flash = new Flash(90, 1000);
                herois[numVetor] = flash;
                break;
            default:
                System.out.println("Numero informado invalido");
                break;
        }
    }
}
